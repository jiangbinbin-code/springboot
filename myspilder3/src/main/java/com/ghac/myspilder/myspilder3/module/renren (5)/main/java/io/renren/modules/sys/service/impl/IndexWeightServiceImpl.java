package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexWeightDao;
import io.renren.modules.sys.entity.IndexWeightEntity;
import io.renren.modules.sys.service.IndexWeightService;


@Service("indexWeightService")
public class IndexWeightServiceImpl extends ServiceImpl<IndexWeightDao, IndexWeightEntity> implements IndexWeightService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexWeightEntity> page = this.page(
                new Query<IndexWeightEntity>().getPage(params),
                new QueryWrapper<IndexWeightEntity>()
        );

        return new PageUtils(page);
    }

}
