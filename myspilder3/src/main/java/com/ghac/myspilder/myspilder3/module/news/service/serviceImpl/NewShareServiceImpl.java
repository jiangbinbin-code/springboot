package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.NewShareDao;
import io.renren.modules.sys.entity.NewShareEntity;
import io.renren.modules.sys.service.NewShareService;


@Service("newShareService")
public class NewShareServiceImpl extends ServiceImpl<NewShareDao, NewShareEntity> implements NewShareService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NewShareEntity> page = this.page(
                new Query<NewShareEntity>().getPage(params),
                new QueryWrapper<NewShareEntity>()
        );

        return new PageUtils(page);
    }

}
