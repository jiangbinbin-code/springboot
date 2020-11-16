package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MarginDao;
import io.renren.modules.sys.entity.MarginEntity;
import io.renren.modules.sys.service.MarginService;


@Service("marginService")
public class MarginServiceImpl extends ServiceImpl<MarginDao, MarginEntity> implements MarginService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MarginEntity> page = this.page(
                new Query<MarginEntity>().getPage(params),
                new QueryWrapper<MarginEntity>()
        );

        return new PageUtils(page);
    }

}
