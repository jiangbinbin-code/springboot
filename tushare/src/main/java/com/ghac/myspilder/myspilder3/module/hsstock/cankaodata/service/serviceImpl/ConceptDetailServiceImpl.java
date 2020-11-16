package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ConceptDetailDao;
import io.renren.modules.sys.entity.ConceptDetailEntity;
import io.renren.modules.sys.service.ConceptDetailService;


@Service("conceptDetailService")
public class ConceptDetailServiceImpl extends ServiceImpl<ConceptDetailDao, ConceptDetailEntity> implements ConceptDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ConceptDetailEntity> page = this.page(
                new Query<ConceptDetailEntity>().getPage(params),
                new QueryWrapper<ConceptDetailEntity>()
        );

        return new PageUtils(page);
    }

}
