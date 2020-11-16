package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexClassifyDao;
import io.renren.modules.sys.entity.IndexClassifyEntity;
import io.renren.modules.sys.service.IndexClassifyService;


@Service("indexClassifyService")
public class IndexClassifyServiceImpl extends ServiceImpl<IndexClassifyDao, IndexClassifyEntity> implements IndexClassifyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexClassifyEntity> page = this.page(
                new Query<IndexClassifyEntity>().getPage(params),
                new QueryWrapper<IndexClassifyEntity>()
        );

        return new PageUtils(page);
    }

}
