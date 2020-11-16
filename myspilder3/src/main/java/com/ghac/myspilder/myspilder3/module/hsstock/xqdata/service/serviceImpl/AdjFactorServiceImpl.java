package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.AdjFactorDao;
import io.renren.modules.sys.entity.AdjFactorEntity;
import io.renren.modules.sys.service.AdjFactorService;


@Service("adjFactorService")
public class AdjFactorServiceImpl extends ServiceImpl<AdjFactorDao, AdjFactorEntity> implements AdjFactorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AdjFactorEntity> page = this.page(
                new Query<AdjFactorEntity>().getPage(params),
                new QueryWrapper<AdjFactorEntity>()
        );

        return new PageUtils(page);
    }

}
