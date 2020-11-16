package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DailyInfoDao;
import io.renren.modules.sys.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;


@Service("dailyInfoService")
public class DailyInfoServiceImpl extends ServiceImpl<DailyInfoDao, DailyInfoEntity> implements DailyInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DailyInfoEntity> page = this.page(
                new Query<DailyInfoEntity>().getPage(params),
                new QueryWrapper<DailyInfoEntity>()
        );

        return new PageUtils(page);
    }

}
