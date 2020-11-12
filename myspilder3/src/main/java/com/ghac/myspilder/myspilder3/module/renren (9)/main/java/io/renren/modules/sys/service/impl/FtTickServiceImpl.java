package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FtTickDao;
import io.renren.modules.sys.entity.FtTickEntity;
import io.renren.modules.sys.service.FtTickService;


@Service("ftTickService")
public class FtTickServiceImpl extends ServiceImpl<FtTickDao, FtTickEntity> implements FtTickService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FtTickEntity> page = this.page(
                new Query<FtTickEntity>().getPage(params),
                new QueryWrapper<FtTickEntity>()
        );

        return new PageUtils(page);
    }

}
