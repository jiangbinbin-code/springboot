package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.GzIndexDao;
import io.renren.modules.sys.entity.GzIndexEntity;
import io.renren.modules.sys.service.GzIndexService;


@Service("gzIndexService")
public class GzIndexServiceImpl extends ServiceImpl<GzIndexDao, GzIndexEntity> implements GzIndexService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GzIndexEntity> page = this.page(
                new Query<GzIndexEntity>().getPage(params),
                new QueryWrapper<GzIndexEntity>()
        );

        return new PageUtils(page);
    }

}
