package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.AnnsDao;
import com.ghac.myspilder.myspilder3.module.news.entity.AnnsEntity;
import com.ghac.myspilder.myspilder3.module.news.service.AnnsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("annsService")
public class AnnsServiceImpl extends ServiceImpl<AnnsDao, AnnsEntity> implements AnnsService {


}
