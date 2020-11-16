package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTltrDao;
import io.renren.modules.sys.entity.UsTltrEntity;
import io.renren.modules.sys.service.UsTltrService;


@Service("usTltrService")
public class UsTltrServiceImpl extends ServiceImpl<UsTltrDao, UsTltrEntity> implements UsTltrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTltrEntity> page = this.page(
                new Query<UsTltrEntity>().getPage(params),
                new QueryWrapper<UsTltrEntity>()
        );

        return new PageUtils(page);
    }

}
