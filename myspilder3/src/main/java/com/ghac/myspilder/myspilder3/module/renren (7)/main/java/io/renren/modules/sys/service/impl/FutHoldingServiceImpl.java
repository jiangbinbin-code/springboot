package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutHoldingDao;
import io.renren.modules.sys.entity.FutHoldingEntity;
import io.renren.modules.sys.service.FutHoldingService;


@Service("futHoldingService")
public class FutHoldingServiceImpl extends ServiceImpl<FutHoldingDao, FutHoldingEntity> implements FutHoldingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutHoldingEntity> page = this.page(
                new Query<FutHoldingEntity>().getPage(params),
                new QueryWrapper<FutHoldingEntity>()
        );

        return new PageUtils(page);
    }

}
