package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexMonthlyDao;
import io.renren.modules.sys.entity.IndexMonthlyEntity;
import io.renren.modules.sys.service.IndexMonthlyService;


@Service("indexMonthlyService")
public class IndexMonthlyServiceImpl extends ServiceImpl<IndexMonthlyDao, IndexMonthlyEntity> implements IndexMonthlyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexMonthlyEntity> page = this.page(
                new Query<IndexMonthlyEntity>().getPage(params),
                new QueryWrapper<IndexMonthlyEntity>()
        );

        return new PageUtils(page);
    }

}
