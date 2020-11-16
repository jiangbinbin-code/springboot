package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.EcoCalDao;
import io.renren.modules.sys.entity.EcoCalEntity;
import io.renren.modules.sys.service.EcoCalService;


@Service("ecoCalService")
public class EcoCalServiceImpl extends ServiceImpl<EcoCalDao, EcoCalEntity> implements EcoCalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EcoCalEntity> page = this.page(
                new Query<EcoCalEntity>().getPage(params),
                new QueryWrapper<EcoCalEntity>()
        );

        return new PageUtils(page);
    }

}
