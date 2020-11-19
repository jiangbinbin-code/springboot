package com.ghac.tusahre.module.news.service.serviceImpl;

import com.ghac.tusahre.module.news.dao.TeleplayRecordDao;
import com.ghac.tusahre.module.news.entity.TeleplayRecordEntity;
import com.ghac.tusahre.module.news.service.TeleplayRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("teleplayRecordService")
public class TeleplayRecordServiceImpl extends ServiceImpl<TeleplayRecordDao, TeleplayRecordEntity> implements TeleplayRecordService {

}
