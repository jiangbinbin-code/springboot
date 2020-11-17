package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



@Service("indexBasicService")
public class IndexBasicServiceImpl extends ServiceImpl<IndexBasicDao, IndexBasicEntity> implements IndexBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexBasicEntity> page = this.page(
                new Query<IndexBasicEntity>().getPage(params),
                new QueryWrapper<IndexBasicEntity>()
        );

        return new PageUtils(page);
    }

}
