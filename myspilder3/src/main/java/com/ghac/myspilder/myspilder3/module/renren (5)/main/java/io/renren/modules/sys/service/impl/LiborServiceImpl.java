package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.LiborDao;
import io.renren.modules.sys.entity.LiborEntity;
import io.renren.modules.sys.service.LiborService;


@Service("liborService")
public class LiborServiceImpl extends ServiceImpl<LiborDao, LiborEntity> implements LiborService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LiborEntity> page = this.page(
                new Query<LiborEntity>().getPage(params),
                new QueryWrapper<LiborEntity>()
        );

        return new PageUtils(page);
    }

}
