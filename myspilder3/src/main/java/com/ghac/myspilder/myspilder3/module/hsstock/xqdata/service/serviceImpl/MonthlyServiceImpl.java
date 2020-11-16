package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MonthlyDao;
import io.renren.modules.sys.entity.MonthlyEntity;
import io.renren.modules.sys.service.MonthlyService;


@Service("monthlyService")
public class MonthlyServiceImpl extends ServiceImpl<MonthlyDao, MonthlyEntity> implements MonthlyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MonthlyEntity> page = this.page(
                new Query<MonthlyEntity>().getPage(params),
                new QueryWrapper<MonthlyEntity>()
        );

        return new PageUtils(page);
    }

}
