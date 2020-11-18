package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.TeleplayRecordDao;
import com.ghac.myspilder.myspilder3.module.news.entity.TeleplayRecordEntity;
import com.ghac.myspilder.myspilder3.module.news.service.TeleplayRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("teleplayRecordService")
public class TeleplayRecordServiceImpl extends ServiceImpl<TeleplayRecordDao, TeleplayRecordEntity> implements TeleplayRecordService {

}
