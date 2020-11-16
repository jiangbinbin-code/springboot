package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BakDailyDao;
import io.renren.modules.sys.entity.BakDailyEntity;
import io.renren.modules.sys.service.BakDailyService;


@Service("bakDailyService")
public class BakDailyServiceImpl extends ServiceImpl<BakDailyDao, BakDailyEntity> implements BakDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BakDailyEntity> page = this.page(
                new Query<BakDailyEntity>().getPage(params),
                new QueryWrapper<BakDailyEntity>()
        );

        return new PageUtils(page);
    }

}
