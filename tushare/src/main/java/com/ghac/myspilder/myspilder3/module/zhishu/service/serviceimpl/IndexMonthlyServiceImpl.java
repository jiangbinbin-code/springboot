package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



@Service("indexMonthlyService")
public class IndexMonthlyServiceImpl extends ServiceImpl<IndexMonthlyDao, IndexMonthlyEntity> implements IndexMonthlyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexMonthlyEntity> page = this.page(
                new Query<IndexMonthlyEntity>().getPage(params),
                new QueryWrapper<IndexMonthlyEntity>()
        );

        return new PageUtils(page);
    }

}
