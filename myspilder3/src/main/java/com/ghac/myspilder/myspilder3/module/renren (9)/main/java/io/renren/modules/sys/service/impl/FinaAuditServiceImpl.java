package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FinaAuditDao;
import io.renren.modules.sys.entity.FinaAuditEntity;
import io.renren.modules.sys.service.FinaAuditService;


@Service("finaAuditService")
public class FinaAuditServiceImpl extends ServiceImpl<FinaAuditDao, FinaAuditEntity> implements FinaAuditService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FinaAuditEntity> page = this.page(
                new Query<FinaAuditEntity>().getPage(params),
                new QueryWrapper<FinaAuditEntity>()
        );

        return new PageUtils(page);
    }

}
