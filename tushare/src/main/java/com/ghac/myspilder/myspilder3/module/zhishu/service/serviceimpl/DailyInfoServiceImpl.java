package com.ghac.myspilder.myspilder3.module.zhishu.service.serviceimpl;

import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;



@Service("dailyInfoService")
public class DailyInfoServiceImpl extends ServiceImpl<DailyInfoDao, DailyInfoEntity> implements DailyInfoService {

}
