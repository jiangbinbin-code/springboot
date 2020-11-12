package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TmtTwincomeDao;
import io.renren.modules.sys.entity.TmtTwincomeEntity;
import io.renren.modules.sys.service.TmtTwincomeService;


@Service("tmtTwincomeService")
public class TmtTwincomeServiceImpl extends ServiceImpl<TmtTwincomeDao, TmtTwincomeEntity> implements TmtTwincomeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmtTwincomeEntity> page = this.page(
                new Query<TmtTwincomeEntity>().getPage(params),
                new QueryWrapper<TmtTwincomeEntity>()
        );

        return new PageUtils(page);
    }

}
