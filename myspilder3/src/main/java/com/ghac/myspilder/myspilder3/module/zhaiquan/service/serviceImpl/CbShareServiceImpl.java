package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CbShareDao;
import io.renren.modules.sys.entity.CbShareEntity;
import io.renren.modules.sys.service.CbShareService;


@Service("cbShareService")
public class CbShareServiceImpl extends ServiceImpl<CbShareDao, CbShareEntity> implements CbShareService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CbShareEntity> page = this.page(
                new Query<CbShareEntity>().getPage(params),
                new QueryWrapper<CbShareEntity>()
        );

        return new PageUtils(page);
    }

}
