package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ConceptDao;
import io.renren.modules.sys.entity.ConceptEntity;
import io.renren.modules.sys.service.ConceptService;


@Service("conceptService")
public class ConceptServiceImpl extends ServiceImpl<ConceptDao, ConceptEntity> implements ConceptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ConceptEntity> page = this.page(
                new Query<ConceptEntity>().getPage(params),
                new QueryWrapper<ConceptEntity>()
        );

        return new PageUtils(page);
    }

}
