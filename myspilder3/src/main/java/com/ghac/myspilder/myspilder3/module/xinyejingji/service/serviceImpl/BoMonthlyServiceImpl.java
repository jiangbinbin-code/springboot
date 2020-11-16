package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BoMonthlyDao;
import io.renren.modules.sys.entity.BoMonthlyEntity;
import io.renren.modules.sys.service.BoMonthlyService;


@Service("boMonthlyService")
public class BoMonthlyServiceImpl extends ServiceImpl<BoMonthlyDao, BoMonthlyEntity> implements BoMonthlyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BoMonthlyEntity> page = this.page(
                new Query<BoMonthlyEntity>().getPage(params),
                new QueryWrapper<BoMonthlyEntity>()
        );

        return new PageUtils(page);
    }

}
