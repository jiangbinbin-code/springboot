package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;


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
