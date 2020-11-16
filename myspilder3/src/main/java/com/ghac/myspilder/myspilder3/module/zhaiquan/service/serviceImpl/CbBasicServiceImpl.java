package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CbBasicDao;
import io.renren.modules.sys.entity.CbBasicEntity;
import io.renren.modules.sys.service.CbBasicService;


@Service("cbBasicService")
public class CbBasicServiceImpl extends ServiceImpl<CbBasicDao, CbBasicEntity> implements CbBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CbBasicEntity> page = this.page(
                new Query<CbBasicEntity>().getPage(params),
                new QueryWrapper<CbBasicEntity>()
        );

        return new PageUtils(page);
    }

}
