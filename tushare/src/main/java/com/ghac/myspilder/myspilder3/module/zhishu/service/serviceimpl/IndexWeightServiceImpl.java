package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.IndexWeightDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.IndexWeightEntity;




@Service("indexWeightService")
public class IndexWeightServiceImpl extends ServiceImpl<IndexWeightDao, IndexWeightEntity> implements IndexWeightService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexWeightEntity> page = this.page(
                new Query<IndexWeightEntity>().getPage(params),
                new QueryWrapper<IndexWeightEntity>()
        );

        return new PageUtils(page);
    }

}
