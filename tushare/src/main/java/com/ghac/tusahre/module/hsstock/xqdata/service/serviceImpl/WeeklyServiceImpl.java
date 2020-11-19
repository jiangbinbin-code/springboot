package com.ghac.tusahre.module.hsstock.xqdata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.xqdata.dao.WeeklyDao;
import com.ghac.tusahre.module.hsstock.xqdata.entity.WeeklyEntity;
import com.ghac.tusahre.module.hsstock.xqdata.service.WeeklyService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("weeklyService")
public class WeeklyServiceImpl extends ServiceImpl<WeeklyDao, WeeklyEntity> implements WeeklyService {


}
