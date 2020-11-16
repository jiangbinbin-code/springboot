package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundShareDao;
import io.renren.modules.sys.entity.FundShareEntity;
import io.renren.modules.sys.service.FundShareService;


@Service("fundShareService")
public class FundShareServiceImpl extends ServiceImpl<FundShareDao, FundShareEntity> implements FundShareService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundShareEntity> page = this.page(
                new Query<FundShareEntity>().getPage(params),
                new QueryWrapper<FundShareEntity>()
        );

        return new PageUtils(page);
    }

}
