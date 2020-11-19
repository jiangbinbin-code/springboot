package com.ghac.tusahre.module.news.service.serviceImpl;

import com.ghac.tusahre.module.news.dao.CctvNewsDao;
import com.ghac.tusahre.module.news.entity.CctvNewsEntity;
import com.ghac.tusahre.module.news.service.CctvNewsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("cctvNewsService")
public class CctvNewsServiceImpl extends ServiceImpl<CctvNewsDao, CctvNewsEntity> implements CctvNewsService {


}
