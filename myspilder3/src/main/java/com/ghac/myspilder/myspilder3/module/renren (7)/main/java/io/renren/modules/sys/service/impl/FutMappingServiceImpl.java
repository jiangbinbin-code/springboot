package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutMappingDao;
import io.renren.modules.sys.entity.FutMappingEntity;
import io.renren.modules.sys.service.FutMappingService;


@Service("futMappingService")
public class FutMappingServiceImpl extends ServiceImpl<FutMappingDao, FutMappingEntity> implements FutMappingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutMappingEntity> page = this.page(
                new Query<FutMappingEntity>().getPage(params),
                new QueryWrapper<FutMappingEntity>()
        );

        return new PageUtils(page);
    }

}
