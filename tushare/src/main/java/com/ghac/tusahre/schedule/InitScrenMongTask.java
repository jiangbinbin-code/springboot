package com.ghac.tusahre.schedule;



import com.alibaba.fastjson.JSONObject;
import com.ghac.tusahre.module.hsstock.basicdata.dao.StockBasicDao;
import com.ghac.tusahre.mongdb.entity.Tushare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Configuration
@EnableScheduling
public class InitScrenMongTask {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private StockBasicDao stockBasicDao;
   //3.添加定时任务
    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        Query query=new Query();
        query.addCriteria(Criteria.where("type").is("1"));
        List<Tushare> ts = mongoTemplate.find(query, Tushare.class);
        if(null != ts &&  ts.size()>0){
            ts.forEach(tushare -> {
                String data = tushare.getData();
                String s = JSONObject.toJSONString(data);
                System.out.println(s);
//                List<StockBasicEntity>  sbasics= JSONArray.parseArray(s, StockBasicEntity.class);
//                stockBasicDao.()
            });
        }
    }
}
