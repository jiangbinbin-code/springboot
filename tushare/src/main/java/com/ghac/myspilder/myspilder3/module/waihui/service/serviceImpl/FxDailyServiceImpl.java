package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FxDailyDao;
import io.renren.modules.sys.entity.FxDailyEntity;
import io.renren.modules.sys.service.FxDailyService;


@Service("fxDailyService")
public class FxDailyServiceImpl extends ServiceImpl<FxDailyDao, FxDailyEntity> implements FxDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FxDailyEntity> page = this.page(
                new Query<FxDailyEntity>().getPage(params),
                new QueryWrapper<FxDailyEntity>()
        );

        return new PageUtils(page);
    }

}
