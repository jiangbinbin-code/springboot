package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundDivDao;
import io.renren.modules.sys.entity.FundDivEntity;
import io.renren.modules.sys.service.FundDivService;


@Service("fundDivService")
public class FundDivServiceImpl extends ServiceImpl<FundDivDao, FundDivEntity> implements FundDivService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundDivEntity> page = this.page(
                new Query<FundDivEntity>().getPage(params),
                new QueryWrapper<FundDivEntity>()
        );

        return new PageUtils(page);
    }

}
