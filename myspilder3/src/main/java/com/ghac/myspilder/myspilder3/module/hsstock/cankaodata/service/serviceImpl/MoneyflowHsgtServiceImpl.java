package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MoneyflowHsgtDao;
import io.renren.modules.sys.entity.MoneyflowHsgtEntity;
import io.renren.modules.sys.service.MoneyflowHsgtService;


@Service("moneyflowHsgtService")
public class MoneyflowHsgtServiceImpl extends ServiceImpl<MoneyflowHsgtDao, MoneyflowHsgtEntity> implements MoneyflowHsgtService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MoneyflowHsgtEntity> page = this.page(
                new Query<MoneyflowHsgtEntity>().getPage(params),
                new QueryWrapper<MoneyflowHsgtEntity>()
        );

        return new PageUtils(page);
    }

}
