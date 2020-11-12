package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CnMDao;
import io.renren.modules.sys.entity.CnMEntity;
import io.renren.modules.sys.service.CnMService;


@Service("cnMService")
public class CnMServiceImpl extends ServiceImpl<CnMDao, CnMEntity> implements CnMService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CnMEntity> page = this.page(
                new Query<CnMEntity>().getPage(params),
                new QueryWrapper<CnMEntity>()
        );

        return new PageUtils(page);
    }

}
