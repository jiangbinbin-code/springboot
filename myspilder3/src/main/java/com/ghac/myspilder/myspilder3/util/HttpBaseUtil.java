package com.ghac.myspilder.myspilder3.util;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class HttpBaseUtil {


    public static void HttpGet(String url) {
        //请求列表页
        String listContent = HttpUtil.get("https://data.stats.gov.cn/");
        System.out.println(listContent);
        Document doc = Jsoup.parse(listContent);
        Elements links = doc.select("a[href]");
        links.forEach(link -> {
            String linkHref = link.attr("href");
            System.out.println(linkHref);
        });

//        List<String> strings = links.eachText();
//        strings.forEach(link->{
//            System.out.println(link);
//        });
        //使用正则获取所有标题
        //System.out.println(listContent);
//        List<String> titles = ReUtil.findAll("<span class=\"text-ellipsis\">(.*?)</span>", listContent, 1);
//        for (String title : titles) {
//            //打印标题
//            System.out.println(""+title);
//
//        }
//        List<String> all = ReUtil.findAll("<a\\b[^>]+\\bhref=\"([^\"]*)\"[^>]*>([\\s\\S]*?)</a>\n", listContent, 2);
//        all.forEach(a->{
//            System.out.println(a);
//        });
    }

    public static void main(String args[]){
        HttpGet("");
    }
}
