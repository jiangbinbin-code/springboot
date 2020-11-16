package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutSettleDao;
import io.renren.modules.sys.entity.FutSettleEntity;
import io.renren.modules.sys.service.FutSettleService;


@Service("futSettleService")
public class FutSettleServiceImpl extends ServiceImpl<FutSettleDao, FutSettleEntity> implements FutSettleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutSettleEntity> page = this.page(
                new Query<FutSettleEntity>().getPage(params),
                new QueryWrapper<FutSettleEntity>()
        );

        return new PageUtils(page);
    }

}
