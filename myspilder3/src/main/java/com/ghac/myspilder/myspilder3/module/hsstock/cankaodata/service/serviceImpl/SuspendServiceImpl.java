package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.SuspendDao;
import io.renren.modules.sys.entity.SuspendEntity;
import io.renren.modules.sys.service.SuspendService;


@Service("suspendService")
public class SuspendServiceImpl extends ServiceImpl<SuspendDao, SuspendEntity> implements SuspendService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SuspendEntity> page = this.page(
                new Query<SuspendEntity>().getPage(params),
                new QueryWrapper<SuspendEntity>()
        );

        return new PageUtils(page);
    }

}
