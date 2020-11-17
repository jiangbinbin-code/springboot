package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;


@Service("expressService")
public class ExpressServiceImpl extends ServiceImpl<ExpressDao, ExpressEntity> implements ExpressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ExpressEntity> page = this.page(
                new Query<ExpressEntity>().getPage(params),
                new QueryWrapper<ExpressEntity>()
        );

        return new PageUtils(page);
    }

}
