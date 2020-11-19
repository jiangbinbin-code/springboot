package com.ghac.tusahre.module.zhaiquan.service.serviceImpl;

import org.springframework.stereotype.Service;
import com.ghac.tusahre.module.zhaiquan.dao.EcoCalDao;
import com.ghac.tusahre.module.zhaiquan.service.EcoCalService;
import com.ghac.tusahre.module.zhaiquan.entity.EcoCalEntity;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("ecoCalService")
public class EcoCalServiceImpl extends ServiceImpl<EcoCalDao, EcoCalEntity> implements EcoCalService {

}
