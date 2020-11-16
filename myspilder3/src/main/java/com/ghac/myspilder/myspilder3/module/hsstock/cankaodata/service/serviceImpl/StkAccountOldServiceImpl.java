package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkAccountOldDao;
import io.renren.modules.sys.entity.StkAccountOldEntity;
import io.renren.modules.sys.service.StkAccountOldService;


@Service("stkAccountOldService")
public class StkAccountOldServiceImpl extends ServiceImpl<StkAccountOldDao, StkAccountOldEntity> implements StkAccountOldService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkAccountOldEntity> page = this.page(
                new Query<StkAccountOldEntity>().getPage(params),
                new QueryWrapper<StkAccountOldEntity>()
        );

        return new PageUtils(page);
    }

}
