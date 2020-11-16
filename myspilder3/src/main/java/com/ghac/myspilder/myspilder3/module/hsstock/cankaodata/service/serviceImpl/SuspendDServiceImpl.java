package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.SuspendDDao;
import io.renren.modules.sys.entity.SuspendDEntity;
import io.renren.modules.sys.service.SuspendDService;


@Service("suspendDService")
public class SuspendDServiceImpl extends ServiceImpl<SuspendDDao, SuspendDEntity> implements SuspendDService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SuspendDEntity> page = this.page(
                new Query<SuspendDEntity>().getPage(params),
                new QueryWrapper<SuspendDEntity>()
        );

        return new PageUtils(page);
    }

}
