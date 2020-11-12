package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.HkBasicDao;
import io.renren.modules.sys.entity.HkBasicEntity;
import io.renren.modules.sys.service.HkBasicService;


@Service("hkBasicService")
public class HkBasicServiceImpl extends ServiceImpl<HkBasicDao, HkBasicEntity> implements HkBasicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HkBasicEntity> page = this.page(
                new Query<HkBasicEntity>().getPage(params),
                new QueryWrapper<HkBasicEntity>()
        );

        return new PageUtils(page);
    }

}
