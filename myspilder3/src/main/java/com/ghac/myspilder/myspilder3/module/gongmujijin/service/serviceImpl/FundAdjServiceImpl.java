package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundAdjDao;
import io.renren.modules.sys.entity.FundAdjEntity;
import io.renren.modules.sys.service.FundAdjService;


@Service("fundAdjService")
public class FundAdjServiceImpl extends ServiceImpl<FundAdjDao, FundAdjEntity> implements FundAdjService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundAdjEntity> page = this.page(
                new Query<FundAdjEntity>().getPage(params),
                new QueryWrapper<FundAdjEntity>()
        );

        return new PageUtils(page);
    }

}
