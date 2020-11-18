package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.NewShareDao;
import com.ghac.myspilder.myspilder3.module.news.entity.NewShareEntity;
import com.ghac.myspilder.myspilder3.module.news.service.NewShareService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("newShareService")
public class NewShareServiceImpl extends ServiceImpl<NewShareDao, NewShareEntity> implements NewShareService {


}
