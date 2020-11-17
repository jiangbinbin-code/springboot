package com.ghac.myspilder.myspilder3.module.gangstock.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.gangstock.dao.HkBasicDao;
import com.ghac.myspilder.myspilder3.module.gangstock.service.HkBasicService;
import com.ghac.myspilder.myspilder3.util.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.renren.modules.sys.entity.HkBasicEntity;



@Service("hkBasicService")
public class HkBasicServiceImpl extends ServiceImpl<HkBasicDao, HkBasicEntity> implements HkBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HkBasicEntity> page = this.page(
                new Query<HkBasicEntity>().getPage(params),
                new QueryWrapper<HkBasicEntity>()
        );

        return new PageUtils(page);
    }

}
