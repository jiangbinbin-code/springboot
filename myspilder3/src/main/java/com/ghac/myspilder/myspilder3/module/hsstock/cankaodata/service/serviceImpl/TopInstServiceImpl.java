package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TopInstDao;
import io.renren.modules.sys.entity.TopInstEntity;
import io.renren.modules.sys.service.TopInstService;


@Service("topInstService")
public class TopInstServiceImpl extends ServiceImpl<TopInstDao, TopInstEntity> implements TopInstService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TopInstEntity> page = this.page(
                new Query<TopInstEntity>().getPage(params),
                new QueryWrapper<TopInstEntity>()
        );

        return new PageUtils(page);
    }

}
