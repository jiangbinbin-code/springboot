package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;

import io.renren.modules.sys.service.IndexDailyService;


@Service("indexDailyService")
public class IndexDailyServiceImpl extends ServiceImpl<IndexDailyDao, IndexDailyEntity> implements IndexDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexDailyEntity> page = this.page(
                new Query<IndexDailyEntity>().getPage(params),
                new QueryWrapper<IndexDailyEntity>()
        );

        return new PageUtils(page);
    }

}
