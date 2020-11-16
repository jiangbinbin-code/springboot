package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DividendDao;
import io.renren.modules.sys.entity.DividendEntity;
import io.renren.modules.sys.service.DividendService;


@Service("dividendService")
public class DividendServiceImpl extends ServiceImpl<DividendDao, DividendEntity> implements DividendService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DividendEntity> page = this.page(
                new Query<DividendEntity>().getPage(params),
                new QueryWrapper<DividendEntity>()
        );

        return new PageUtils(page);
    }

}
