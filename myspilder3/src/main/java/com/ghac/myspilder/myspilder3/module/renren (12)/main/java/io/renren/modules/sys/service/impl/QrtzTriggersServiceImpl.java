package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.QrtzTriggersDao;
import io.renren.modules.sys.entity.QrtzTriggersEntity;
import io.renren.modules.sys.service.QrtzTriggersService;


@Service("qrtzTriggersService")
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersDao, QrtzTriggersEntity> implements QrtzTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzTriggersEntity> page = this.page(
                new Query<QrtzTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzTriggersEntity>()
        );

        return new PageUtils(page);
    }

}
