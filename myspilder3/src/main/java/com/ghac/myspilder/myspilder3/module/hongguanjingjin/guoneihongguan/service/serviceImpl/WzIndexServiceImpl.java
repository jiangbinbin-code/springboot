package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.WzIndexDao;
import io.renren.modules.sys.entity.WzIndexEntity;
import io.renren.modules.sys.service.WzIndexService;


@Service("wzIndexService")
public class WzIndexServiceImpl extends ServiceImpl<WzIndexDao, WzIndexEntity> implements WzIndexService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WzIndexEntity> page = this.page(
                new Query<WzIndexEntity>().getPage(params),
                new QueryWrapper<WzIndexEntity>()
        );

        return new PageUtils(page);
    }

}
