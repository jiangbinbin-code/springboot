package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.QrtzFiredTriggersDao;
import io.renren.modules.sys.entity.QrtzFiredTriggersEntity;
import io.renren.modules.sys.service.QrtzFiredTriggersService;


@Service("qrtzFiredTriggersService")
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersDao, QrtzFiredTriggersEntity> implements QrtzFiredTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzFiredTriggersEntity> page = this.page(
                new Query<QrtzFiredTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzFiredTriggersEntity>()
        );

        return new PageUtils(page);
    }

}
