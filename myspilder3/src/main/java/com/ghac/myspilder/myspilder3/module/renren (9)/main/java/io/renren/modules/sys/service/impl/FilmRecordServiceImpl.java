package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FilmRecordDao;
import io.renren.modules.sys.entity.FilmRecordEntity;
import io.renren.modules.sys.service.FilmRecordService;


@Service("filmRecordService")
public class FilmRecordServiceImpl extends ServiceImpl<FilmRecordDao, FilmRecordEntity> implements FilmRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FilmRecordEntity> page = this.page(
                new Query<FilmRecordEntity>().getPage(params),
                new QueryWrapper<FilmRecordEntity>()
        );

        return new PageUtils(page);
    }

}
