package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TopListDao;
import io.renren.modules.sys.entity.TopListEntity;
import io.renren.modules.sys.service.TopListService;


@Service("topListService")
public class TopListServiceImpl extends ServiceImpl<TopListDao, TopListEntity> implements TopListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TopListEntity> page = this.page(
                new Query<TopListEntity>().getPage(params),
                new QueryWrapper<TopListEntity>()
        );

        return new PageUtils(page);
    }

}
