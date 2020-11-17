package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



@Service("indexClassifyService")
public class IndexClassifyServiceImpl extends ServiceImpl<IndexClassifyDao, IndexClassifyEntity> implements IndexClassifyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexClassifyEntity> page = this.page(
                new Query<IndexClassifyEntity>().getPage(params),
                new QueryWrapper<IndexClassifyEntity>()
        );

        return new PageUtils(page);
    }

}
