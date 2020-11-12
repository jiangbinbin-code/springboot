package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HkDailyDao;
import io.renren.modules.sys.entity.HkDailyEntity;
import io.renren.modules.sys.service.HkDailyService;


@Service("hkDailyService")
public class HkDailyServiceImpl extends ServiceImpl<HkDailyDao, HkDailyEntity> implements HkDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HkDailyEntity> page = this.page(
                new Query<HkDailyEntity>().getPage(params),
                new QueryWrapper<HkDailyEntity>()
        );

        return new PageUtils(page);
    }

}
