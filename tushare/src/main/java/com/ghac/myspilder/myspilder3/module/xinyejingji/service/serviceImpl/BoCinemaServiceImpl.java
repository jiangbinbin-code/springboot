package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BoCinemaDao;
import io.renren.modules.sys.entity.BoCinemaEntity;
import io.renren.modules.sys.service.BoCinemaService;


@Service("boCinemaService")
public class BoCinemaServiceImpl extends ServiceImpl<BoCinemaDao, BoCinemaEntity> implements BoCinemaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BoCinemaEntity> page = this.page(
                new Query<BoCinemaEntity>().getPage(params),
                new QueryWrapper<BoCinemaEntity>()
        );

        return new PageUtils(page);
    }

}
