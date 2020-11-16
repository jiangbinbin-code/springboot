package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.OptBasicDao;
import io.renren.modules.sys.entity.OptBasicEntity;
import io.renren.modules.sys.service.OptBasicService;


@Service("optBasicService")
public class OptBasicServiceImpl extends ServiceImpl<OptBasicDao, OptBasicEntity> implements OptBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OptBasicEntity> page = this.page(
                new Query<OptBasicEntity>().getPage(params),
                new QueryWrapper<OptBasicEntity>()
        );

        return new PageUtils(page);
    }

}
