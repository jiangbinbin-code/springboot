package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutWeeklyDetailDao;
import io.renren.modules.sys.entity.FutWeeklyDetailEntity;
import io.renren.modules.sys.service.FutWeeklyDetailService;


@Service("futWeeklyDetailService")
public class FutWeeklyDetailServiceImpl extends ServiceImpl<FutWeeklyDetailDao, FutWeeklyDetailEntity> implements FutWeeklyDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutWeeklyDetailEntity> page = this.page(
                new Query<FutWeeklyDetailEntity>().getPage(params),
                new QueryWrapper<FutWeeklyDetailEntity>()
        );

        return new PageUtils(page);
    }

}
