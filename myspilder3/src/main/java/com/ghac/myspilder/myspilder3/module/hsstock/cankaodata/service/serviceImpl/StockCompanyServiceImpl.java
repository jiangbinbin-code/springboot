package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StockCompanyDao;
import io.renren.modules.sys.entity.StockCompanyEntity;
import io.renren.modules.sys.service.StockCompanyService;


@Service("stockCompanyService")
public class StockCompanyServiceImpl extends ServiceImpl<StockCompanyDao, StockCompanyEntity> implements StockCompanyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StockCompanyEntity> page = this.page(
                new Query<StockCompanyEntity>().getPage(params),
                new QueryWrapper<StockCompanyEntity>()
        );

        return new PageUtils(page);
    }

}
