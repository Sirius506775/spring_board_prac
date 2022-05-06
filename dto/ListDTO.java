package org.zerock.pleasespring.dto;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@ToString
@Getter
public class ListDTO {

    private int page;

    private int size;

    private String link;

    //t tc tcw
    private String type;

    private String keyword;

    public ListDTO(){
        this.page = 1;
        this.size = 10;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String[] getTypes(){
        if(type == null){
            return new String[]{};
        }
        return type.split("");
    }

    public String getKeyword(){
        return keyword ==null ? null: keyword.trim();
    }

    public void setPage(int page) {
        this.page = page <= 0? 1: page;
    }

    public void setSize(int size) {
        this.size = size < 10? 10: size;
    }

    public int getSkip(){
        return (this.page - 1) * size;
    }

    public String getLink(){

        UriComponentsBuilder builder = UriComponentsBuilder.newInstance();
        builder.queryParam("page", getPage())
                .queryParam("size", getSize());

        if(type != null){
            builder.queryParam("type", type);
        }

        if(keyword != null){
            try {
                String enStr = URLEncoder.encode("세종 대왕 만세", "UTF-8");
                builder.queryParam("keyword", enStr);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }
        

        return builder.build().toString();
    }
}
