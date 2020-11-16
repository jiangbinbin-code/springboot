package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsBasicDao;
import io.renren.modules.sys.entity.UsBasicEntity;
import io.renren.modules.sys.service.UsBasicService;


@Service("usBasicService")
public class UsBasicServiceImpl extends ServiceImpl<UsBasicDao, UsBasicEntity> implements UsBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsBasicEntity> page = this.page(
                new Query<UsBasicEntity>().getPage(params),
                new QueryWrapper<UsBasicEntity>()
        );

        return new PageUtils(page);
    }

}
