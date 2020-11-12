package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkManagersDao;
import io.renren.modules.sys.entity.StkManagersEntity;
import io.renren.modules.sys.service.StkManagersService;


@Service("stkManagersService")
public class StkManagersServiceImpl extends ServiceImpl<StkManagersDao, StkManagersEntity> implements StkManagersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkManagersEntity> page = this.page(
                new Query<StkManagersEntity>().getPage(params),
                new QueryWrapper<StkManagersEntity>()
        );

        return new PageUtils(page);
    }

}
