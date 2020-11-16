package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkLimitDao;
import io.renren.modules.sys.entity.StkLimitEntity;
import io.renren.modules.sys.service.StkLimitService;


@Service("stkLimitService")
public class StkLimitServiceImpl extends ServiceImpl<StkLimitDao, StkLimitEntity> implements StkLimitService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkLimitEntity> page = this.page(
                new Query<StkLimitEntity>().getPage(params),
                new QueryWrapper<StkLimitEntity>()
        );

        return new PageUtils(page);
    }

}
