package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CbPriceChgDao;
import io.renren.modules.sys.entity.CbPriceChgEntity;
import io.renren.modules.sys.service.CbPriceChgService;


@Service("cbPriceChgService")
public class CbPriceChgServiceImpl extends ServiceImpl<CbPriceChgDao, CbPriceChgEntity> implements CbPriceChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CbPriceChgEntity> page = this.page(
                new Query<CbPriceChgEntity>().getPage(params),
                new QueryWrapper<CbPriceChgEntity>()
        );

        return new PageUtils(page);
    }

}
