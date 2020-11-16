package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FxObasicDao;
import io.renren.modules.sys.entity.FxObasicEntity;
import io.renren.modules.sys.service.FxObasicService;


@Service("fxObasicService")
public class FxObasicServiceImpl extends ServiceImpl<FxObasicDao, FxObasicEntity> implements FxObasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FxObasicEntity> page = this.page(
                new Query<FxObasicEntity>().getPage(params),
                new QueryWrapper<FxObasicEntity>()
        );

        return new PageUtils(page);
    }

}
