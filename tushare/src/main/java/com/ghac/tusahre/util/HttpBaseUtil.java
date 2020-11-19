package com.ghac.tusahre.util;

import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.thymeleaf.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
/**
 * 国家数据
 * */
public class HttpBaseUtil {


    public static void HttpGet(String url) {
        //请求列表页


        //http://www.stats.gov.cn/tjsj/ndsj/2019/indexch.htm
        String listContent = HttpUtil.get("https://data.stats.gov.cn/");
        String preURl="https://data.stats.gov.cn/";
        List<String> ifnormas=new ArrayList<>();
        List<String> tables=new ArrayList<>();
        List<String> easys=new ArrayList<>();
        List<String> searchs=new ArrayList<>();
        Document doc = Jsoup.parse(listContent);
        Elements links = doc.select("a[href]");
        links.forEach(link -> {
            String linkHref = link.attr("href");
            if(StringUtils.contains(linkHref,"ifnormal.htm")){
                ifnormas.add(preURl+linkHref);
            }else if(StringUtils.contains(linkHref,"tablequery.htm")){
                tables.add(preURl+linkHref);
            }else if(StringUtils.contains(linkHref,"search.htm")){
                searchs.add(preURl+linkHref);
            }else if(StringUtils.contains(linkHref,"easyquery.htm")){
                easys.add(preURl+linkHref);
            }else{
              //  System.out.println("----"+linkHref);
            }
        });
        System.out.println("---------------easys start -------------");
        getEasyQueryInfo( easys);
        System.out.println("---------------easys end -------------");
//        System.out.println("---------------searchs starts -------------");
//        getSearchQueryInfo( searchs);
//        System.out.println("---------------searchs end -------------");
//        System.out.println("---------------tables starts -------------");
//        getTablequeryInfo( tables);
//        System.out.println("---------------tables end -------------");
//        System.out.println("---------------ifnormas starts -------------");
//        getIfnormalInfo( ifnormas);
//        System.out.println("---------------ifnormas end -------------");
    }

    public static void main(String args[]){
        HttpGet("");
    }

    public static void getEasyQueryInfo(List<String> easyUrl){
        if(null!=easyUrl && easyUrl.size()>0){
            easyUrl.forEach(url->{
                String listContent = HttpUtil.get(url);
                Document doc = Jsoup.parse(listContent);
                Elements links = doc.select("a[href]");
                links.forEach(link -> {
                    String linkHref = link.attr("href");
                    if(StringUtils.contains(linkHref,"ifnormal.htm")){
//                        String listContent2 = HttpUtil.get("https://data.stats.gov.cn/"+linkHref);
//                        System.out.println(listContent2);

                    }else if(StringUtils.contains(linkHref,"tablequery.htm")){
                        String listContent2 = HttpUtil.get("https://data.stats.gov.cn/");
                    }else if(StringUtils.contains(linkHref,"search.htm")){
                        String listContent2 = HttpUtil.get("https://data.stats.gov.cn/");
                    }else if(StringUtils.contains(linkHref,"easyquery.htm")){
                        String listContent2 = HttpUtil.get("https://data.stats.gov.cn/"+linkHref);
                        System.out.println(listContent2);
                    }else{
                        //  System.out.println("----"+linkHref);
                    }
                });

            });
        }

    }
    public static void getSearchQueryInfo(List<String> searchUrl){
        if(null!=searchUrl && searchUrl.size()>0){
            searchUrl.forEach(url->{
                String listContent = HttpUtil.get(url);
                Document doc = Jsoup.parse(listContent);
                Elements links = doc.select("a[href]");
                links.forEach(link -> {
                    String linkHref = link.attr("href");
                    System.out.println(linkHref);
                });
            });
        }

    }
    public static void getTablequeryInfo(List<String> tableUrl){
        if(null!=tableUrl && tableUrl.size()>0){
            tableUrl.forEach(url->{
                String listContent = HttpUtil.get(url);
                Document doc = Jsoup.parse(listContent);
                Elements links = doc.select("a[href]");
                links.forEach(link -> {
                    String linkHref = link.attr("href");
                    System.out.println(linkHref);
                });
            });
        }

    }
    public static void getIfnormalInfo(List<String> infomalUrl){
        if(null!=infomalUrl && infomalUrl.size()>0){
            infomalUrl.forEach(url->{
                String listContent = HttpUtil.get(url);
                Document doc = Jsoup.parse(listContent);
                Elements links = doc.select("a[href]");
                links.forEach(link -> {
                    String linkHref = link.attr("href");
                    System.out.println(linkHref);
                });
            });
        }

    }
}
