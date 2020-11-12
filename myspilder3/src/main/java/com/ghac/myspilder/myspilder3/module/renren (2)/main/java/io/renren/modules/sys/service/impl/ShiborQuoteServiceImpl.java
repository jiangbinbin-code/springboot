package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ShiborQuoteDao;
import io.renren.modules.sys.entity.ShiborQuoteEntity;
import io.renren.modules.sys.service.ShiborQuoteService;


@Service("shiborQuoteService")
public class ShiborQuoteServiceImpl extends ServiceImpl<ShiborQuoteDao, ShiborQuoteEntity> implements ShiborQuoteService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ShiborQuoteEntity> page = this.page(
                new Query<ShiborQuoteEntity>().getPage(params),
                new QueryWrapper<ShiborQuoteEntity>()
        );

        return new PageUtils(page);
    }

}
