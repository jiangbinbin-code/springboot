package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CnCpiDao;
import io.renren.modules.sys.entity.CnCpiEntity;
import io.renren.modules.sys.service.CnCpiService;


@Service("cnCpiService")
public class CnCpiServiceImpl extends ServiceImpl<CnCpiDao, CnCpiEntity> implements CnCpiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CnCpiEntity> page = this.page(
                new Query<CnCpiEntity>().getPage(params),
                new QueryWrapper<CnCpiEntity>()
        );

        return new PageUtils(page);
    }

}
