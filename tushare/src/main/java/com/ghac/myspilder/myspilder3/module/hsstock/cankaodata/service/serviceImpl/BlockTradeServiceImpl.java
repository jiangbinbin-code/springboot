package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BlockTradeDao;
import io.renren.modules.sys.entity.BlockTradeEntity;
import io.renren.modules.sys.service.BlockTradeService;


@Service("blockTradeService")
public class BlockTradeServiceImpl extends ServiceImpl<BlockTradeDao, BlockTradeEntity> implements BlockTradeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BlockTradeEntity> page = this.page(
                new Query<BlockTradeEntity>().getPage(params),
                new QueryWrapper<BlockTradeEntity>()
        );

        return new PageUtils(page);
    }

}
