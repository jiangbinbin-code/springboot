//package com.ghac.myspilder.myspilder3.config;
//
//
//import com.sasai.wallet.entity.TbLanguageCopy;
//import com.sasai.wallet.repository.TbLanguageCopyRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ConcurrentMap;
//
///**
// * 配置文件 定时获取
// *
// * @author Z
// * @date 2019/3/26
// */
//@Component
//public class Configuration {
//
//    @Autowired
//    private TbLanguageCopyRepository languageCopyRepository;
//
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);
//    /**
//     * 文案 使用代码+"#"+语言标识id  如2233#1
//     */
//    public static ConcurrentMap<String, String> Copywriting = new ConcurrentHashMap<>();
//
//    //每隔2分钟执行一次
//    @Scheduled(fixedRate = 2 * 1000 * 60)
//    public void testTasks() {
//        //读取数据库
//        ConcurrentMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
//        List<TbLanguageCopy> languageCopyList = languageCopyRepository.findAll();
//        for (TbLanguageCopy languageCopy : languageCopyList) {
//            String code = languageCopy.getLanguageId() + "#" + languageCopy.getCode();
//            // LOGGER.warn("[Language ] 保存"+ code+" "+ languageCopy.getStr());
//            concurrentHashMap.put(code+"", languageCopy.getStr()+"");
//        }
//
//        Configuration.Copywriting.putAll(concurrentHashMap);
//    }
//
//
//
//
//}
//
//
//
//
//
//
