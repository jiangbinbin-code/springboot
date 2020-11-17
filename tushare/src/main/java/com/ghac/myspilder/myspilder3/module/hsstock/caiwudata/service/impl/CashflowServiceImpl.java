package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.CashflowDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.CashflowService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.CashflowEntity;


@Service("cashflowService")
public class CashflowServiceImpl extends ServiceImpl<CashflowDao, CashflowEntity> implements CashflowService {


}
