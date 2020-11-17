package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;

@Service("finaIndicatorService")
public class FinaIndicatorServiceImpl extends ServiceImpl<FinaIndicatorDao, FinaIndicatorEntity> implements FinaIndicatorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FinaIndicatorEntity> page = this.page(
                new Query<FinaIndicatorEntity>().getPage(params),
                new QueryWrapper<FinaIndicatorEntity>()
        );

        return new PageUtils(page);
    }

}
