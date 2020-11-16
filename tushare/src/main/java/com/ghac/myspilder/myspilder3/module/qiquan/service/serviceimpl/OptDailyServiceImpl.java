package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.OptDailyDao;
import io.renren.modules.sys.entity.OptDailyEntity;
import io.renren.modules.sys.service.OptDailyService;


@Service("optDailyService")
public class OptDailyServiceImpl extends ServiceImpl<OptDailyDao, OptDailyEntity> implements OptDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OptDailyEntity> page = this.page(
                new Query<OptDailyEntity>().getPage(params),
                new QueryWrapper<OptDailyEntity>()
        );

        return new PageUtils(page);
    }

}
