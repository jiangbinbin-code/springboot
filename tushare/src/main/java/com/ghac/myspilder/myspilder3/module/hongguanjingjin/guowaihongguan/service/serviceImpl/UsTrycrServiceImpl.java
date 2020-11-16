package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTrycrDao;
import io.renren.modules.sys.entity.UsTrycrEntity;
import io.renren.modules.sys.service.UsTrycrService;


@Service("usTrycrService")
public class UsTrycrServiceImpl extends ServiceImpl<UsTrycrDao, UsTrycrEntity> implements UsTrycrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTrycrEntity> page = this.page(
                new Query<UsTrycrEntity>().getPage(params),
                new QueryWrapper<UsTrycrEntity>()
        );

        return new PageUtils(page);
    }

}
