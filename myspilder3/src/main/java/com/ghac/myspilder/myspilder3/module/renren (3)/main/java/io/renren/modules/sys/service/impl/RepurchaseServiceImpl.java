package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.RepurchaseDao;
import io.renren.modules.sys.entity.RepurchaseEntity;
import io.renren.modules.sys.service.RepurchaseService;


@Service("repurchaseService")
public class RepurchaseServiceImpl extends ServiceImpl<RepurchaseDao, RepurchaseEntity> implements RepurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RepurchaseEntity> page = this.page(
                new Query<RepurchaseEntity>().getPage(params),
                new QueryWrapper<RepurchaseEntity>()
        );

        return new PageUtils(page);
    }

}
