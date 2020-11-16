package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.GgtTop10Dao;
import io.renren.modules.sys.entity.GgtTop10Entity;
import io.renren.modules.sys.service.GgtTop10Service;


@Service("ggtTop10Service")
public class GgtTop10ServiceImpl extends ServiceImpl<GgtTop10Dao, GgtTop10Entity> implements GgtTop10Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GgtTop10Entity> page = this.page(
                new Query<GgtTop10Entity>().getPage(params),
                new QueryWrapper<GgtTop10Entity>()
        );

        return new PageUtils(page);
    }

}
