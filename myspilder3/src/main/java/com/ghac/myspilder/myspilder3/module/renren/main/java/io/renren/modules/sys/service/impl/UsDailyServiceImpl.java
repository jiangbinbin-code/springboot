package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsDailyDao;
import io.renren.modules.sys.entity.UsDailyEntity;
import io.renren.modules.sys.service.UsDailyService;


@Service("usDailyService")
public class UsDailyServiceImpl extends ServiceImpl<UsDailyDao, UsDailyEntity> implements UsDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsDailyEntity> page = this.page(
                new Query<UsDailyEntity>().getPage(params),
                new QueryWrapper<UsDailyEntity>()
        );

        return new PageUtils(page);
    }

}
