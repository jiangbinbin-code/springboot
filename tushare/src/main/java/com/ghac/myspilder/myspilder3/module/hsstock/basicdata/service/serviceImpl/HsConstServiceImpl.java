package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HsConstDao;
import io.renren.modules.sys.entity.HsConstEntity;
import io.renren.modules.sys.service.HsConstService;


@Service("hsConstService")
public class HsConstServiceImpl extends ServiceImpl<HsConstDao, HsConstEntity> implements HsConstService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HsConstEntity> page = this.page(
                new Query<HsConstEntity>().getPage(params),
                new QueryWrapper<HsConstEntity>()
        );

        return new PageUtils(page);
    }

}
