package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BoWeeklyDao;
import io.renren.modules.sys.entity.BoWeeklyEntity;
import io.renren.modules.sys.service.BoWeeklyService;


@Service("boWeeklyService")
public class BoWeeklyServiceImpl extends ServiceImpl<BoWeeklyDao, BoWeeklyEntity> implements BoWeeklyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BoWeeklyEntity> page = this.page(
                new Query<BoWeeklyEntity>().getPage(params),
                new QueryWrapper<BoWeeklyEntity>()
        );

        return new PageUtils(page);
    }

}
