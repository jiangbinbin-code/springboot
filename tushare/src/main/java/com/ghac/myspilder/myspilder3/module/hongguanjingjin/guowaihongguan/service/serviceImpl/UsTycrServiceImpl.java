package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTycrDao;
import io.renren.modules.sys.entity.UsTycrEntity;
import io.renren.modules.sys.service.UsTycrService;


@Service("usTycrService")
public class UsTycrServiceImpl extends ServiceImpl<UsTycrDao, UsTycrEntity> implements UsTycrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTycrEntity> page = this.page(
                new Query<UsTycrEntity>().getPage(params),
                new QueryWrapper<UsTycrEntity>()
        );

        return new PageUtils(page);
    }

}
