package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MarginDetailDao;
import io.renren.modules.sys.entity.MarginDetailEntity;
import io.renren.modules.sys.service.MarginDetailService;


@Service("marginDetailService")
public class MarginDetailServiceImpl extends ServiceImpl<MarginDetailDao, MarginDetailEntity> implements MarginDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MarginDetailEntity> page = this.page(
                new Query<MarginDetailEntity>().getPage(params),
                new QueryWrapper<MarginDetailEntity>()
        );

        return new PageUtils(page);
    }

}
