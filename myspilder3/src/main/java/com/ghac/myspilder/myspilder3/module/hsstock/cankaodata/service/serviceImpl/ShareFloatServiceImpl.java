package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ShareFloatDao;
import io.renren.modules.sys.entity.ShareFloatEntity;
import io.renren.modules.sys.service.ShareFloatService;


@Service("shareFloatService")
public class ShareFloatServiceImpl extends ServiceImpl<ShareFloatDao, ShareFloatEntity> implements ShareFloatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ShareFloatEntity> page = this.page(
                new Query<ShareFloatEntity>().getPage(params),
                new QueryWrapper<ShareFloatEntity>()
        );

        return new PageUtils(page);
    }

}
