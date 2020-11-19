package com.ghac.tusahre.module.gangstock.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.tusahre.module.gangstock.dao.HkDailyDao;
import com.ghac.tusahre.module.gangstock.entity.HkDailyEntity;
import com.ghac.tusahre.module.gangstock.service.HkDailyService;
import org.springframework.stereotype.Service;


@Service("hkDailyService")
public class HkDailyServiceImpl extends ServiceImpl<HkDailyDao, HkDailyEntity> implements HkDailyService {


}
