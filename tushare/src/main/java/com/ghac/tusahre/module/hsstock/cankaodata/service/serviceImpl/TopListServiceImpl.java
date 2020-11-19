package com.ghac.tusahre.module.hsstock.cankaodata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.cankaodata.dao.TopListDao;
import com.ghac.tusahre.module.hsstock.cankaodata.entity.TopListEntity;
import com.ghac.tusahre.module.hsstock.cankaodata.service.TopListService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("topListService")
public class TopListServiceImpl extends ServiceImpl<TopListDao, TopListEntity> implements TopListService {


}
