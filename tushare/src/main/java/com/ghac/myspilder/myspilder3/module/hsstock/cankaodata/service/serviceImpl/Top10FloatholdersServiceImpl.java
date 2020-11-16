package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.Top10FloatholdersDao;
import io.renren.modules.sys.entity.Top10FloatholdersEntity;
import io.renren.modules.sys.service.Top10FloatholdersService;


@Service("top10FloatholdersService")
public class Top10FloatholdersServiceImpl extends ServiceImpl<Top10FloatholdersDao, Top10FloatholdersEntity> implements Top10FloatholdersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Top10FloatholdersEntity> page = this.page(
                new Query<Top10FloatholdersEntity>().getPage(params),
                new QueryWrapper<Top10FloatholdersEntity>()
        );

        return new PageUtils(page);
    }

}
