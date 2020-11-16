package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CashflowDao;
import io.renren.modules.sys.entity.CashflowEntity;
import io.renren.modules.sys.service.CashflowService;


@Service("cashflowService")
public class CashflowServiceImpl extends ServiceImpl<CashflowDao, CashflowEntity> implements CashflowService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CashflowEntity> page = this.page(
                new Query<CashflowEntity>().getPage(params),
                new QueryWrapper<CashflowEntity>()
        );

        return new PageUtils(page);
    }

}
