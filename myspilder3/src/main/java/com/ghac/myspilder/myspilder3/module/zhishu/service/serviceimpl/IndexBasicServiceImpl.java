package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexBasicDao;
import io.renren.modules.sys.entity.IndexBasicEntity;
import io.renren.modules.sys.service.IndexBasicService;


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
