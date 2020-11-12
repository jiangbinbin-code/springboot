package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.NamechangeDao;
import io.renren.modules.sys.entity.NamechangeEntity;
import io.renren.modules.sys.service.NamechangeService;


@Service("namechangeService")
public class NamechangeServiceImpl extends ServiceImpl<NamechangeDao, NamechangeEntity> implements NamechangeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NamechangeEntity> page = this.page(
                new Query<NamechangeEntity>().getPage(params),
                new QueryWrapper<NamechangeEntity>()
        );

        return new PageUtils(page);
    }

}
