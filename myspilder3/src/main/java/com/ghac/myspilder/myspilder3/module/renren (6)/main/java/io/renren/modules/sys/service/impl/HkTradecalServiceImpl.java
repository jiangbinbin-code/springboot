package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HkTradecalDao;
import io.renren.modules.sys.entity.HkTradecalEntity;
import io.renren.modules.sys.service.HkTradecalService;


@Service("hkTradecalService")
public class HkTradecalServiceImpl extends ServiceImpl<HkTradecalDao, HkTradecalEntity> implements HkTradecalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HkTradecalEntity> page = this.page(
                new Query<HkTradecalEntity>().getPage(params),
                new QueryWrapper<HkTradecalEntity>()
        );

        return new PageUtils(page);
    }

}
