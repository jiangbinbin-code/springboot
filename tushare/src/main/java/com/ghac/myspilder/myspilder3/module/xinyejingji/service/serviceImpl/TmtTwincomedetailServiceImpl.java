package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TmtTwincomedetailDao;
import io.renren.modules.sys.entity.TmtTwincomedetailEntity;
import io.renren.modules.sys.service.TmtTwincomedetailService;


@Service("tmtTwincomedetailService")
public class TmtTwincomedetailServiceImpl extends ServiceImpl<TmtTwincomedetailDao, TmtTwincomedetailEntity> implements TmtTwincomedetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmtTwincomedetailEntity> page = this.page(
                new Query<TmtTwincomedetailEntity>().getPage(params),
                new QueryWrapper<TmtTwincomedetailEntity>()
        );

        return new PageUtils(page);
    }

}
