package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutDailyDao;
import io.renren.modules.sys.entity.FutDailyEntity;
import io.renren.modules.sys.service.FutDailyService;


@Service("futDailyService")
public class FutDailyServiceImpl extends ServiceImpl<FutDailyDao, FutDailyEntity> implements FutDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutDailyEntity> page = this.page(
                new Query<FutDailyEntity>().getPage(params),
                new QueryWrapper<FutDailyEntity>()
        );

        return new PageUtils(page);
    }

}
