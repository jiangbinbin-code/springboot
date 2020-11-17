package com.ghac.myspilder.myspilder3.module.gongmujijin.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.gongmujijin.dao.FundShareDao;
import com.ghac.myspilder.myspilder3.module.gongmujijin.service.FundShareService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.FundShareEntity;


@Service("fundShareService")
public class FundShareServiceImpl extends ServiceImpl<FundShareDao, FundShareEntity> implements FundShareService {

}
