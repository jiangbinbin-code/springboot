package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CnGdpDao;
import io.renren.modules.sys.entity.CnGdpEntity;
import io.renren.modules.sys.service.CnGdpService;


@Service("cnGdpService")
public class CnGdpServiceImpl extends ServiceImpl<CnGdpDao, CnGdpEntity> implements CnGdpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CnGdpEntity> page = this.page(
                new Query<CnGdpEntity>().getPage(params),
                new QueryWrapper<CnGdpEntity>()
        );

        return new PageUtils(page);
    }

}
