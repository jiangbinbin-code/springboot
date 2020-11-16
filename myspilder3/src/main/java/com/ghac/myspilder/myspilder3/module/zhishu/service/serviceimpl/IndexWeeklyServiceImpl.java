package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexWeeklyDao;
import io.renren.modules.sys.entity.IndexWeeklyEntity;
import io.renren.modules.sys.service.IndexWeeklyService;


@Service("indexWeeklyService")
public class IndexWeeklyServiceImpl extends ServiceImpl<IndexWeeklyDao, IndexWeeklyEntity> implements IndexWeeklyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexWeeklyEntity> page = this.page(
                new Query<IndexWeeklyEntity>().getPage(params),
                new QueryWrapper<IndexWeeklyEntity>()
        );

        return new PageUtils(page);
    }

}
