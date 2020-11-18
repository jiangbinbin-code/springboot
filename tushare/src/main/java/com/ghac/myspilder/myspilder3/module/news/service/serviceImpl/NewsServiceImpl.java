package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.NewsDao;
import com.ghac.myspilder.myspilder3.module.news.entity.NewsEntity;
import com.ghac.myspilder.myspilder3.module.news.service.NewsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {


}
