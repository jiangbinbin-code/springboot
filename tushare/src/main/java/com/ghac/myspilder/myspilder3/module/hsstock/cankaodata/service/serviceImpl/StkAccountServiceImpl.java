package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.StkAccountDao;
import io.renren.modules.sys.entity.StkAccountEntity;
import io.renren.modules.sys.service.StkAccountService;


@Service("stkAccountService")
public class StkAccountServiceImpl extends ServiceImpl<StkAccountDao, StkAccountEntity> implements StkAccountService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StkAccountEntity> page = this.page(
                new Query<StkAccountEntity>().getPage(params),
                new QueryWrapper<StkAccountEntity>()
        );

        return new PageUtils(page);
    }

}
