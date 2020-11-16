package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.PledgeDetailDao;
import io.renren.modules.sys.entity.PledgeDetailEntity;
import io.renren.modules.sys.service.PledgeDetailService;


@Service("pledgeDetailService")
public class PledgeDetailServiceImpl extends ServiceImpl<PledgeDetailDao, PledgeDetailEntity> implements PledgeDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PledgeDetailEntity> page = this.page(
                new Query<PledgeDetailEntity>().getPage(params),
                new QueryWrapper<PledgeDetailEntity>()
        );

        return new PageUtils(page);
    }

}
