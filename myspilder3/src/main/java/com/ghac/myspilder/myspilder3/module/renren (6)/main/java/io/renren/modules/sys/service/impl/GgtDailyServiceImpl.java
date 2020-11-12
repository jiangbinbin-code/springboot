package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.GgtDailyDao;
import io.renren.modules.sys.entity.GgtDailyEntity;
import io.renren.modules.sys.service.GgtDailyService;


@Service("ggtDailyService")
public class GgtDailyServiceImpl extends ServiceImpl<GgtDailyDao, GgtDailyEntity> implements GgtDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GgtDailyEntity> page = this.page(
                new Query<GgtDailyEntity>().getPage(params),
                new QueryWrapper<GgtDailyEntity>()
        );

        return new PageUtils(page);
    }

}
