package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ShiborDao;
import io.renren.modules.sys.entity.ShiborEntity;
import io.renren.modules.sys.service.ShiborService;


@Service("shiborService")
public class ShiborServiceImpl extends ServiceImpl<ShiborDao, ShiborEntity> implements ShiborService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ShiborEntity> page = this.page(
                new Query<ShiborEntity>().getPage(params),
                new QueryWrapper<ShiborEntity>()
        );

        return new PageUtils(page);
    }

}
