package com.ghac.tusahre.module.waihui.service.serviceImpl;

import com.ghac.tusahre.module.waihui.dao.FxDailyDao;
import com.ghac.tusahre.module.waihui.entity.FxDailyEntity;
import com.ghac.tusahre.module.waihui.service.FxDailyService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("fxDailyService")
public class FxDailyServiceImpl extends ServiceImpl<FxDailyDao, FxDailyEntity> implements FxDailyService {

}
