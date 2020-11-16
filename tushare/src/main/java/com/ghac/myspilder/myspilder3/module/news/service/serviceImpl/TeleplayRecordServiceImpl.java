package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TeleplayRecordDao;
import io.renren.modules.sys.entity.TeleplayRecordEntity;
import io.renren.modules.sys.service.TeleplayRecordService;


@Service("teleplayRecordService")
public class TeleplayRecordServiceImpl extends ServiceImpl<TeleplayRecordDao, TeleplayRecordEntity> implements TeleplayRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TeleplayRecordEntity> page = this.page(
                new Query<TeleplayRecordEntity>().getPage(params),
                new QueryWrapper<TeleplayRecordEntity>()
        );

        return new PageUtils(page);
    }

}
