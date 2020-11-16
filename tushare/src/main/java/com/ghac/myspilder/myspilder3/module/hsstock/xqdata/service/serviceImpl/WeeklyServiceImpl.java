package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.WeeklyDao;
import io.renren.modules.sys.entity.WeeklyEntity;
import io.renren.modules.sys.service.WeeklyService;


@Service("weeklyService")
public class WeeklyServiceImpl extends ServiceImpl<WeeklyDao, WeeklyEntity> implements WeeklyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WeeklyEntity> page = this.page(
                new Query<WeeklyEntity>().getPage(params),
                new QueryWrapper<WeeklyEntity>()
        );

        return new PageUtils(page);
    }

}
