package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundNavDao;
import io.renren.modules.sys.entity.FundNavEntity;
import io.renren.modules.sys.service.FundNavService;


@Service("fundNavService")
public class FundNavServiceImpl extends ServiceImpl<FundNavDao, FundNavEntity> implements FundNavService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundNavEntity> page = this.page(
                new Query<FundNavEntity>().getPage(params),
                new QueryWrapper<FundNavEntity>()
        );

        return new PageUtils(page);
    }

}
