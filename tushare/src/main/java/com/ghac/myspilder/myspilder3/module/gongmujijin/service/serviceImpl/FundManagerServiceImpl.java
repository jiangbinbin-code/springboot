package com.ghac.myspilder.myspilder3.module.gongmujijin.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.gongmujijin.dao.FundManagerDao;
import com.ghac.myspilder.myspilder3.module.gongmujijin.service.FundManagerService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.FundManagerEntity;


@Service("fundManagerService")
public class FundManagerServiceImpl extends ServiceImpl<FundManagerDao, FundManagerEntity> implements FundManagerService {


}
