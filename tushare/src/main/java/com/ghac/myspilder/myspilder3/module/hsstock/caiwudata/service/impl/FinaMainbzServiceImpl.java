package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FinaMainbzDao;
import io.renren.modules.sys.entity.FinaMainbzEntity;
import io.renren.modules.sys.service.FinaMainbzService;


@Service("finaMainbzService")
public class FinaMainbzServiceImpl extends ServiceImpl<FinaMainbzDao, FinaMainbzEntity> implements FinaMainbzService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FinaMainbzEntity> page = this.page(
                new Query<FinaMainbzEntity>().getPage(params),
                new QueryWrapper<FinaMainbzEntity>()
        );

        return new PageUtils(page);
    }

}
