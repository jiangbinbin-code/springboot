package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTrltrDao;
import io.renren.modules.sys.entity.UsTrltrEntity;
import io.renren.modules.sys.service.UsTrltrService;


@Service("usTrltrService")
public class UsTrltrServiceImpl extends ServiceImpl<UsTrltrDao, UsTrltrEntity> implements UsTrltrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTrltrEntity> page = this.page(
                new Query<UsTrltrEntity>().getPage(params),
                new QueryWrapper<UsTrltrEntity>()
        );

        return new PageUtils(page);
    }

}
