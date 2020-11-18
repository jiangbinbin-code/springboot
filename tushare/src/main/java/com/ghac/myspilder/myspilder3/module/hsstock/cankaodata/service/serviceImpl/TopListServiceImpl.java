package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.dao.TopListDao;
import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.entity.TopListEntity;
import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.TopListService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("topListService")
public class TopListServiceImpl extends ServiceImpl<TopListDao, TopListEntity> implements TopListService {


}
