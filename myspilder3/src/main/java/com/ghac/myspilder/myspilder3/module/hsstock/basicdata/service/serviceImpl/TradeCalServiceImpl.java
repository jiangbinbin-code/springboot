package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TradeCalDao;
import io.renren.modules.sys.entity.TradeCalEntity;
import io.renren.modules.sys.service.TradeCalService;


@Service("tradeCalService")
public class TradeCalServiceImpl extends ServiceImpl<TradeCalDao, TradeCalEntity> implements TradeCalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TradeCalEntity> page = this.page(
                new Query<TradeCalEntity>().getPage(params),
                new QueryWrapper<TradeCalEntity>()
        );

        return new PageUtils(page);
    }

}
