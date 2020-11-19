package com.ghac.tusahre.module.hsstock.cankaodata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.cankaodata.dao.StockCompanyDao;
import com.ghac.tusahre.module.hsstock.cankaodata.entity.StockCompanyEntity;
import com.ghac.tusahre.module.hsstock.cankaodata.service.StockCompanyService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("stockCompanyService")
public class StockCompanyServiceImpl extends ServiceImpl<StockCompanyDao, StockCompanyEntity> implements StockCompanyService {


}
