package com.ghac.myspilder.myspilder3.module.gangstock.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.gangstock.service.HkDailyService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.sys.dao.HkDailyDao;
import io.renren.modules.sys.entity.HkDailyEntity;


@Service("hkDailyService")
public class HkDailyServiceImpl extends ServiceImpl<HkDailyDao, HkDailyEntity> implements HkDailyService {



}
