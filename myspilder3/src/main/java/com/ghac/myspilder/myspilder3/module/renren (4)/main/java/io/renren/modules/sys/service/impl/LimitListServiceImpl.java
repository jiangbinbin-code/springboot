package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.LimitListDao;
import io.renren.modules.sys.entity.LimitListEntity;
import io.renren.modules.sys.service.LimitListService;


@Service("limitListService")
public class LimitListServiceImpl extends ServiceImpl<LimitListDao, LimitListEntity> implements LimitListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LimitListEntity> page = this.page(
                new Query<LimitListEntity>().getPage(params),
                new QueryWrapper<LimitListEntity>()
        );

        return new PageUtils(page);
    }

}
