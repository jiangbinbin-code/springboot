package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FundBasicDao;
import io.renren.modules.sys.entity.FundBasicEntity;
import io.renren.modules.sys.service.FundBasicService;


@Service("fundBasicService")
public class FundBasicServiceImpl extends ServiceImpl<FundBasicDao, FundBasicEntity> implements FundBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FundBasicEntity> page = this.page(
                new Query<FundBasicEntity>().getPage(params),
                new QueryWrapper<FundBasicEntity>()
        );

        return new PageUtils(page);
    }

}
