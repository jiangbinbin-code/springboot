package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DailyBasicDao;
import io.renren.modules.sys.entity.DailyBasicEntity;
import io.renren.modules.sys.service.DailyBasicService;


@Service("dailyBasicService")
public class DailyBasicServiceImpl extends ServiceImpl<DailyBasicDao, DailyBasicEntity> implements DailyBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DailyBasicEntity> page = this.page(
                new Query<DailyBasicEntity>().getPage(params),
                new QueryWrapper<DailyBasicEntity>()
        );

        return new PageUtils(page);
    }

}
