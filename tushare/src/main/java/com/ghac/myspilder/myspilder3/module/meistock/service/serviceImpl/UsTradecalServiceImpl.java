package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.UsTradecalDao;
import io.renren.modules.sys.entity.UsTradecalEntity;
import io.renren.modules.sys.service.UsTradecalService;


@Service("usTradecalService")
public class UsTradecalServiceImpl extends ServiceImpl<UsTradecalDao, UsTradecalEntity> implements UsTradecalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UsTradecalEntity> page = this.page(
                new Query<UsTradecalEntity>().getPage(params),
                new QueryWrapper<UsTradecalEntity>()
        );

        return new PageUtils(page);
    }

}
