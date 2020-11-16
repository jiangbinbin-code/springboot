package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkHoldernumberDao;
import io.renren.modules.sys.entity.StkHoldernumberEntity;
import io.renren.modules.sys.service.StkHoldernumberService;


@Service("stkHoldernumberService")
public class StkHoldernumberServiceImpl extends ServiceImpl<StkHoldernumberDao, StkHoldernumberEntity> implements StkHoldernumberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkHoldernumberEntity> page = this.page(
                new Query<StkHoldernumberEntity>().getPage(params),
                new QueryWrapper<StkHoldernumberEntity>()
        );

        return new PageUtils(page);
    }

}
