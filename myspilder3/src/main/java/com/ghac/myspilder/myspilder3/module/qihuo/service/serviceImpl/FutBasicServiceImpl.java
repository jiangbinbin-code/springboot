package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutBasicDao;
import io.renren.modules.sys.entity.FutBasicEntity;
import io.renren.modules.sys.service.FutBasicService;


@Service("futBasicService")
public class FutBasicServiceImpl extends ServiceImpl<FutBasicDao, FutBasicEntity> implements FutBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutBasicEntity> page = this.page(
                new Query<FutBasicEntity>().getPage(params),
                new QueryWrapper<FutBasicEntity>()
        );

        return new PageUtils(page);
    }

}
