package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundManagerDao;
import io.renren.modules.sys.entity.FundManagerEntity;
import io.renren.modules.sys.service.FundManagerService;


@Service("fundManagerService")
public class FundManagerServiceImpl extends ServiceImpl<FundManagerDao, FundManagerEntity> implements FundManagerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundManagerEntity> page = this.page(
                new Query<FundManagerEntity>().getPage(params),
                new QueryWrapper<FundManagerEntity>()
        );

        return new PageUtils(page);
    }

}
