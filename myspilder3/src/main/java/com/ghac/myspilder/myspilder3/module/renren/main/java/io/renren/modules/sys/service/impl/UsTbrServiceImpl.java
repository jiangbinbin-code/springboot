package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTbrDao;
import io.renren.modules.sys.entity.UsTbrEntity;
import io.renren.modules.sys.service.UsTbrService;


@Service("usTbrService")
public class UsTbrServiceImpl extends ServiceImpl<UsTbrDao, UsTbrEntity> implements UsTbrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTbrEntity> page = this.page(
                new Query<UsTbrEntity>().getPage(params),
                new QueryWrapper<UsTbrEntity>()
        );

        return new PageUtils(page);
    }

}
