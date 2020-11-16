package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.RepoDailyDao;
import io.renren.modules.sys.entity.RepoDailyEntity;
import io.renren.modules.sys.service.RepoDailyService;


@Service("repoDailyService")
public class RepoDailyServiceImpl extends ServiceImpl<RepoDailyDao, RepoDailyEntity> implements RepoDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RepoDailyEntity> page = this.page(
                new Query<RepoDailyEntity>().getPage(params),
                new QueryWrapper<RepoDailyEntity>()
        );

        return new PageUtils(page);
    }

}
