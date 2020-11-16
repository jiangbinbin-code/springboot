package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CbDailyDao;
import io.renren.modules.sys.entity.CbDailyEntity;
import io.renren.modules.sys.service.CbDailyService;


@Service("cbDailyService")
public class CbDailyServiceImpl extends ServiceImpl<CbDailyDao, CbDailyEntity> implements CbDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CbDailyEntity> page = this.page(
                new Query<CbDailyEntity>().getPage(params),
                new QueryWrapper<CbDailyEntity>()
        );

        return new PageUtils(page);
    }

}
