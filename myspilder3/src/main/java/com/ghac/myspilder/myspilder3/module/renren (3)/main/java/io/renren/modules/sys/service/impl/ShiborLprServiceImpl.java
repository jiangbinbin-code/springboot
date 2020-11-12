package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ShiborLprDao;
import io.renren.modules.sys.entity.ShiborLprEntity;
import io.renren.modules.sys.service.ShiborLprService;


@Service("shiborLprService")
public class ShiborLprServiceImpl extends ServiceImpl<ShiborLprDao, ShiborLprEntity> implements ShiborLprService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ShiborLprEntity> page = this.page(
                new Query<ShiborLprEntity>().getPage(params),
                new QueryWrapper<ShiborLprEntity>()
        );

        return new PageUtils(page);
    }

}
