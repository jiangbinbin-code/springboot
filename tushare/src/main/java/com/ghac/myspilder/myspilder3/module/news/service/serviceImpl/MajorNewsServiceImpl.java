package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.MajorNewsDao;
import com.ghac.myspilder.myspilder3.module.news.entity.MajorNewsEntity;
import com.ghac.myspilder.myspilder3.module.news.service.MajorNewsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("majorNewsService")
public class MajorNewsServiceImpl extends ServiceImpl<MajorNewsDao, MajorNewsEntity> implements MajorNewsService {


}
