package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CnPpiDao;
import io.renren.modules.sys.entity.CnPpiEntity;
import io.renren.modules.sys.service.CnPpiService;


@Service("cnPpiService")
public class CnPpiServiceImpl extends ServiceImpl<CnPpiDao, CnPpiEntity> implements CnPpiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CnPpiEntity> page = this.page(
                new Query<CnPpiEntity>().getPage(params),
                new QueryWrapper<CnPpiEntity>()
        );

        return new PageUtils(page);
    }

}
