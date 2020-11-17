package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



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
