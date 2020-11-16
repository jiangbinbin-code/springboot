package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BoDailyDao;
import io.renren.modules.sys.entity.BoDailyEntity;
import io.renren.modules.sys.service.BoDailyService;


@Service("boDailyService")
public class BoDailyServiceImpl extends ServiceImpl<BoDailyDao, BoDailyEntity> implements BoDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BoDailyEntity> page = this.page(
                new Query<BoDailyEntity>().getPage(params),
                new QueryWrapper<BoDailyEntity>()
        );

        return new PageUtils(page);
    }

}
