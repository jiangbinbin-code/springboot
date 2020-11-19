package com.ghac.tusahre.util;

import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 统计年鉴
 * */
public class HttpBaseUtil2 {


    public static void HttpGet(String url) {
        //请求列表页
        List<String> yearsHref=new ArrayList<>();
       // int year = new Date().getYear();
        for(int i=1999;i<2021;i++){
            yearsHref.add("http://www.stats.gov.cn/tjsj/ndsj/"+ i +"/indexch.htm");
        }
        yearsHref.forEach(href->{
            String listContent = HttpUtil.get(href);
            System.out.println(listContent);
            List<String> ifnormas=new ArrayList<>();
            List<String> tables=new ArrayList<>();
            List<String> easys=new ArrayList<>();
            List<String> searchs=new ArrayList<>();
            Document doc = Jsoup.parse(listContent);
        });
    }

    public static void main(String args[]){
        HttpGet("");
    }


}
