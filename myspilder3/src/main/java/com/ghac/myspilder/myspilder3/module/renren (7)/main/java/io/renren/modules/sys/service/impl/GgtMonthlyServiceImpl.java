package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.GgtMonthlyDao;
import io.renren.modules.sys.entity.GgtMonthlyEntity;
import io.renren.modules.sys.service.GgtMonthlyService;


@Service("ggtMonthlyService")
public class GgtMonthlyServiceImpl extends ServiceImpl<GgtMonthlyDao, GgtMonthlyEntity> implements GgtMonthlyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GgtMonthlyEntity> page = this.page(
                new Query<GgtMonthlyEntity>().getPage(params),
                new QueryWrapper<GgtMonthlyEntity>()
        );

        return new PageUtils(page);
    }

}
