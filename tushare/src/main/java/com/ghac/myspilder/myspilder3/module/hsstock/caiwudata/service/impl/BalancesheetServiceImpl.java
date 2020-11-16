package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BalancesheetDao;
import io.renren.modules.sys.entity.BalancesheetEntity;
import io.renren.modules.sys.service.BalancesheetService;


@Service("balancesheetService")
public class BalancesheetServiceImpl extends ServiceImpl<BalancesheetDao, BalancesheetEntity> implements BalancesheetService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BalancesheetEntity> page = this.page(
                new Query<BalancesheetEntity>().getPage(params),
                new QueryWrapper<BalancesheetEntity>()
        );

        return new PageUtils(page);
    }

}
