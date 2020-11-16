package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FinaIndicatorDao;
import io.renren.modules.sys.entity.FinaIndicatorEntity;
import io.renren.modules.sys.service.FinaIndicatorService;


@Service("finaIndicatorService")
public class FinaIndicatorServiceImpl extends ServiceImpl<FinaIndicatorDao, FinaIndicatorEntity> implements FinaIndicatorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FinaIndicatorEntity> page = this.page(
                new Query<FinaIndicatorEntity>().getPage(params),
                new QueryWrapper<FinaIndicatorEntity>()
        );

        return new PageUtils(page);
    }

}
