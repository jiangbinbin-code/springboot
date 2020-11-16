package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundPortfolioDao;
import io.renren.modules.sys.entity.FundPortfolioEntity;
import io.renren.modules.sys.service.FundPortfolioService;


@Service("fundPortfolioService")
public class FundPortfolioServiceImpl extends ServiceImpl<FundPortfolioDao, FundPortfolioEntity> implements FundPortfolioService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundPortfolioEntity> page = this.page(
                new Query<FundPortfolioEntity>().getPage(params),
                new QueryWrapper<FundPortfolioEntity>()
        );

        return new PageUtils(page);
    }

}
