package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FutWsrDao;
import io.renren.modules.sys.entity.FutWsrEntity;
import io.renren.modules.sys.service.FutWsrService;


@Service("futWsrService")
public class FutWsrServiceImpl extends ServiceImpl<FutWsrDao, FutWsrEntity> implements FutWsrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FutWsrEntity> page = this.page(
                new Query<FutWsrEntity>().getPage(params),
                new QueryWrapper<FutWsrEntity>()
        );

        return new PageUtils(page);
    }

}
