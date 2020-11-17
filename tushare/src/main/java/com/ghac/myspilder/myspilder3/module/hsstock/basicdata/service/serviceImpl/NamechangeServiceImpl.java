package com.ghac.myspilder.myspilder3.module.hsstock.basicdata.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.dao.NamechangeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.entity.NamechangeEntity;
import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.service.NamechangeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("namechangeService")
public class NamechangeServiceImpl extends ServiceImpl<NamechangeDao, NamechangeEntity> implements NamechangeService {

}
