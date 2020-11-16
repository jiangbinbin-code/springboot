package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StockBasicDao;
import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.StockBasicEntity;
import io.renren.modules.sys.service.StockBasicService;


@Service("stockBasicService")
public class StockBasicServiceImpl extends ServiceImpl<StockBasicDao, StockBasicEntity> implements StockBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StockBasicEntity> page = this.page(
                new Query<StockBasicEntity>().getPage(params),
                new QueryWrapper<StockBasicEntity>()
        );

        return new PageUtils(page);
    }

}
