package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexDaily2Dao;
import io.renren.modules.sys.entity.IndexDaily2Entity;
import io.renren.modules.sys.service.IndexDaily2Service;


@Service("indexDaily2Service")
public class IndexDaily2ServiceImpl extends ServiceImpl<IndexDaily2Dao, IndexDaily2Entity> implements IndexDaily2Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexDaily2Entity> page = this.page(
                new Query<IndexDaily2Entity>().getPage(params),
                new QueryWrapper<IndexDaily2Entity>()
        );

        return new PageUtils(page);
    }

}
