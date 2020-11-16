package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexDailybasicDao;
import io.renren.modules.sys.entity.IndexDailybasicEntity;
import io.renren.modules.sys.service.IndexDailybasicService;


@Service("indexDailybasicService")
public class IndexDailybasicServiceImpl extends ServiceImpl<IndexDailybasicDao, IndexDailybasicEntity> implements IndexDailybasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexDailybasicEntity> page = this.page(
                new Query<IndexDailybasicEntity>().getPage(params),
                new QueryWrapper<IndexDailybasicEntity>()
        );

        return new PageUtils(page);
    }

}
