package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkHoldertradeDao;
import io.renren.modules.sys.entity.StkHoldertradeEntity;
import io.renren.modules.sys.service.StkHoldertradeService;


@Service("stkHoldertradeService")
public class StkHoldertradeServiceImpl extends ServiceImpl<StkHoldertradeDao, StkHoldertradeEntity> implements StkHoldertradeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkHoldertradeEntity> page = this.page(
                new Query<StkHoldertradeEntity>().getPage(params),
                new QueryWrapper<StkHoldertradeEntity>()
        );

        return new PageUtils(page);
    }

}
