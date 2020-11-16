package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexGlobalDao;
import io.renren.modules.sys.entity.IndexGlobalEntity;
import io.renren.modules.sys.service.IndexGlobalService;


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
