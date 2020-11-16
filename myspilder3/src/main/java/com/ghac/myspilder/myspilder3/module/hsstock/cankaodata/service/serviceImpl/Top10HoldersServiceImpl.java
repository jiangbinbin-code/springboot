package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.Top10HoldersDao;
import io.renren.modules.sys.entity.Top10HoldersEntity;
import io.renren.modules.sys.service.Top10HoldersService;


@Service("top10HoldersService")
public class Top10HoldersServiceImpl extends ServiceImpl<Top10HoldersDao, Top10HoldersEntity> implements Top10HoldersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Top10HoldersEntity> page = this.page(
                new Query<Top10HoldersEntity>().getPage(params),
                new QueryWrapper<Top10HoldersEntity>()
        );

        return new PageUtils(page);
    }

}
