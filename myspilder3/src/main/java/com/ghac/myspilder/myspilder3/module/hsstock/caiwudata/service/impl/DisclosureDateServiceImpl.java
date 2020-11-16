package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DisclosureDateDao;
import io.renren.modules.sys.entity.DisclosureDateEntity;
import io.renren.modules.sys.service.DisclosureDateService;


@Service("disclosureDateService")
public class DisclosureDateServiceImpl extends ServiceImpl<DisclosureDateDao, DisclosureDateEntity> implements DisclosureDateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DisclosureDateEntity> page = this.page(
                new Query<DisclosureDateEntity>().getPage(params),
                new QueryWrapper<DisclosureDateEntity>()
        );

        return new PageUtils(page);
    }

}
