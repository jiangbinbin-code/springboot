package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CctvNewsDao;
import io.renren.modules.sys.entity.CctvNewsEntity;
import io.renren.modules.sys.service.CctvNewsService;


@Service("cctvNewsService")
public class CctvNewsServiceImpl extends ServiceImpl<CctvNewsDao, CctvNewsEntity> implements CctvNewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CctvNewsEntity> page = this.page(
                new Query<CctvNewsEntity>().getPage(params),
                new QueryWrapper<CctvNewsEntity>()
        );

        return new PageUtils(page);
    }

}
