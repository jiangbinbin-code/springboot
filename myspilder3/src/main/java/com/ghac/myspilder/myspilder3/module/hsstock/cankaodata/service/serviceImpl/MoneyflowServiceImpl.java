package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MoneyflowDao;
import io.renren.modules.sys.entity.MoneyflowEntity;
import io.renren.modules.sys.service.MoneyflowService;


@Service("moneyflowService")
public class MoneyflowServiceImpl extends ServiceImpl<MoneyflowDao, MoneyflowEntity> implements MoneyflowService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MoneyflowEntity> page = this.page(
                new Query<MoneyflowEntity>().getPage(params),
                new QueryWrapper<MoneyflowEntity>()
        );

        return new PageUtils(page);
    }

}
