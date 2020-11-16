package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkRewardsDao;
import io.renren.modules.sys.entity.StkRewardsEntity;
import io.renren.modules.sys.service.StkRewardsService;


@Service("stkRewardsService")
public class StkRewardsServiceImpl extends ServiceImpl<StkRewardsDao, StkRewardsEntity> implements StkRewardsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkRewardsEntity> page = this.page(
                new Query<StkRewardsEntity>().getPage(params),
                new QueryWrapper<StkRewardsEntity>()
        );

        return new PageUtils(page);
    }

}
