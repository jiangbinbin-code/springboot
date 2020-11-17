package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



@Service("indexWeeklyService")
public class IndexWeeklyServiceImpl extends ServiceImpl<IndexWeeklyDao, IndexWeeklyEntity> implements IndexWeeklyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexWeeklyEntity> page = this.page(
                new Query<IndexWeeklyEntity>().getPage(params),
                new QueryWrapper<IndexWeeklyEntity>()
        );

        return new PageUtils(page);
    }

}
