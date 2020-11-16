package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundDailyDao;
import io.renren.modules.sys.entity.FundDailyEntity;
import io.renren.modules.sys.service.FundDailyService;


@Service("fundDailyService")
public class FundDailyServiceImpl extends ServiceImpl<FundDailyDao, FundDailyEntity> implements FundDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundDailyEntity> page = this.page(
                new Query<FundDailyEntity>().getPage(params),
                new QueryWrapper<FundDailyEntity>()
        );

        return new PageUtils(page);
    }

}
