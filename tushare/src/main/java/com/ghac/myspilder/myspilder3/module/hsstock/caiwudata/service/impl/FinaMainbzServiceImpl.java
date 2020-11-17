package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;


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
