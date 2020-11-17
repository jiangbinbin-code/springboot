package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



@Service("indexGlobalService")
public class IndexGlobalServiceImpl extends ServiceImpl<IndexGlobalDao, IndexGlobalEntity> implements IndexGlobalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexGlobalEntity> page = this.page(
                new Query<IndexGlobalEntity>().getPage(params),
                new QueryWrapper<IndexGlobalEntity>()
        );

        return new PageUtils(page);
    }

}
