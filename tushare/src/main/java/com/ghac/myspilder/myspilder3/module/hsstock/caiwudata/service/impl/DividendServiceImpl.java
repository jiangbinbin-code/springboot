package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;


@Service("dividendService")
public class DividendServiceImpl extends ServiceImpl<DividendDao, DividendEntity> implements DividendService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DividendEntity> page = this.page(
                new Query<DividendEntity>().getPage(params),
                new QueryWrapper<DividendEntity>()
        );

        return new PageUtils(page);
    }

}
