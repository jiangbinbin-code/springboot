package com.ghac.tusahre.module.qiquan.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.tusahre.module.qiquan.dao.FtTickDao;
import com.ghac.tusahre.module.qiquan.entity.FtTickEntity;
import com.ghac.tusahre.module.qiquan.service.FtTickService;
import org.springframework.stereotype.Service;

@Service("ftTickService")
public class FtTickServiceImpl extends ServiceImpl<FtTickDao, FtTickEntity> implements FtTickService {


}
