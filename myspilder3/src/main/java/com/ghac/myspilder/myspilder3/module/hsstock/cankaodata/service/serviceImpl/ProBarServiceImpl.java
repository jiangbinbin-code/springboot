package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ProBarDao;
import io.renren.modules.sys.entity.ProBarEntity;
import io.renren.modules.sys.service.ProBarService;


@Service("proBarService")
public class ProBarServiceImpl extends ServiceImpl<ProBarDao, ProBarEntity> implements ProBarService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProBarEntity> page = this.page(
                new Query<ProBarEntity>().getPage(params),
                new QueryWrapper<ProBarEntity>()
        );

        return new PageUtils(page);
    }

}
