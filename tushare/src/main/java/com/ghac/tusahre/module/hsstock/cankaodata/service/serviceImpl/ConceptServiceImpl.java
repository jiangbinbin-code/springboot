package com.ghac.tusahre.module.hsstock.cankaodata.service.serviceImpl;

import com.ghac.tusahre.module.hsstock.cankaodata.dao.ConceptDao;
import com.ghac.tusahre.module.hsstock.cankaodata.entity.ConceptEntity;
import com.ghac.tusahre.module.hsstock.cankaodata.service.ConceptService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("conceptService")
public class ConceptServiceImpl extends ServiceImpl<ConceptDao, ConceptEntity> implements ConceptService {


}
