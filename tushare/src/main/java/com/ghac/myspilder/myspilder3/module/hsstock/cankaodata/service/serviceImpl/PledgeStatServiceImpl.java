package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.PledgeStatDao;
import io.renren.modules.sys.entity.PledgeStatEntity;
import io.renren.modules.sys.service.PledgeStatService;


@Service("pledgeStatService")
public class PledgeStatServiceImpl extends ServiceImpl<PledgeStatDao, PledgeStatEntity> implements PledgeStatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PledgeStatEntity> page = this.page(
                new Query<PledgeStatEntity>().getPage(params),
                new QueryWrapper<PledgeStatEntity>()
        );

        return new PageUtils(page);
    }

}
