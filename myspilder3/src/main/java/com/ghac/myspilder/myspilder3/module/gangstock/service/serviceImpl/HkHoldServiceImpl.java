package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HkHoldDao;
import io.renren.modules.sys.entity.HkHoldEntity;
import io.renren.modules.sys.service.HkHoldService;


@Service("hkHoldService")
public class HkHoldServiceImpl extends ServiceImpl<HkHoldDao, HkHoldEntity> implements HkHoldService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HkHoldEntity> page = this.page(
                new Query<HkHoldEntity>().getPage(params),
                new QueryWrapper<HkHoldEntity>()
        );

        return new PageUtils(page);
    }

}
