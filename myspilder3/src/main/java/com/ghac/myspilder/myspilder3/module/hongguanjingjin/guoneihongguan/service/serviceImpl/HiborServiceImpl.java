package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HiborDao;
import io.renren.modules.sys.entity.HiborEntity;
import io.renren.modules.sys.service.HiborService;


@Service("hiborService")
public class HiborServiceImpl extends ServiceImpl<HiborDao, HiborEntity> implements HiborService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HiborEntity> page = this.page(
                new Query<HiborEntity>().getPage(params),
                new QueryWrapper<HiborEntity>()
        );

        return new PageUtils(page);
    }

}
