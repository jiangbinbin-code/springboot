package com.ghac.myspilder.myspilder3.module.zhishu.service.serviceimpl;

import com.ghac.myspilder.myspilder3.module.zhishu.service.DailyInfoService;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("dailyInfoService")
public class DailyInfoServiceImpl extends ServiceImpl<DailyInfoDao, DailyInfoEntity> implements DailyInfoService {

}
