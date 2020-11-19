package com.ghac.tusahre.module.hsstock.xqdata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.xqdata.dao.LimitListDao;
import com.ghac.tusahre.module.hsstock.xqdata.entity.LimitListEntity;
import com.ghac.tusahre.module.hsstock.xqdata.service.LimitListService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("limitListService")
public class LimitListServiceImpl extends ServiceImpl<LimitListDao, LimitListEntity> implements LimitListService {

}
