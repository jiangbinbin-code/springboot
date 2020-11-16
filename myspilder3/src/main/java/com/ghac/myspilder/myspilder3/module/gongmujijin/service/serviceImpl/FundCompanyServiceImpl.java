package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundCompanyDao;
import io.renren.modules.sys.entity.FundCompanyEntity;
import io.renren.modules.sys.service.FundCompanyService;


@Service("fundCompanyService")
public class FundCompanyServiceImpl extends ServiceImpl<FundCompanyDao, FundCompanyEntity> implements FundCompanyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundCompanyEntity> page = this.page(
                new Query<FundCompanyEntity>().getPage(params),
                new QueryWrapper<FundCompanyEntity>()
        );

        return new PageUtils(page);
    }

}
