package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexDailyDao;
import io.renren.modules.sys.entity.IndexDailyEntity;
import io.renren.modules.sys.service.IndexDailyService;


@Service("indexDailyService")
public class IndexDailyServiceImpl extends ServiceImpl<IndexDailyDao, IndexDailyEntity> implements IndexDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexDailyEntity> page = this.page(
                new Query<IndexDailyEntity>().getPage(params),
                new QueryWrapper<IndexDailyEntity>()
        );

        return new PageUtils(page);
    }

}
