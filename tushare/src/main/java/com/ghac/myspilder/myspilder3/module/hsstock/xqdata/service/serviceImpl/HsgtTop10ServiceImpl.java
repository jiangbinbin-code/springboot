package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HsgtTop10Dao;
import io.renren.modules.sys.entity.HsgtTop10Entity;
import io.renren.modules.sys.service.HsgtTop10Service;


@Service("hsgtTop10Service")
public class HsgtTop10ServiceImpl extends ServiceImpl<HsgtTop10Dao, HsgtTop10Entity> implements HsgtTop10Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HsgtTop10Entity> page = this.page(
                new Query<HsgtTop10Entity>().getPage(params),
                new QueryWrapper<HsgtTop10Entity>()
        );

        return new PageUtils(page);
    }

}
