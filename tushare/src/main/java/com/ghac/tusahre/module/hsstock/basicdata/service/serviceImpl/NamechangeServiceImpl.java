package com.ghac.tusahre.module.hsstock.basicdata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.basicdata.dao.NamechangeDao;
import com.ghac.tusahre.module.hsstock.basicdata.entity.NamechangeEntity;
import com.ghac.tusahre.module.hsstock.basicdata.service.NamechangeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("namechangeService")
public class NamechangeServiceImpl extends ServiceImpl<NamechangeDao, NamechangeEntity> implements NamechangeService {

}
