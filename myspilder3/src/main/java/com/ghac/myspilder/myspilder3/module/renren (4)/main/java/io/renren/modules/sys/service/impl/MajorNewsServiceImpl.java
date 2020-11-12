package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.MajorNewsDao;
import io.renren.modules.sys.entity.MajorNewsEntity;
import io.renren.modules.sys.service.MajorNewsService;


@Service("majorNewsService")
public class MajorNewsServiceImpl extends ServiceImpl<MajorNewsDao, MajorNewsEntity> implements MajorNewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MajorNewsEntity> page = this.page(
                new Query<MajorNewsEntity>().getPage(params),
                new QueryWrapper<MajorNewsEntity>()
        );

        return new PageUtils(page);
    }

}
