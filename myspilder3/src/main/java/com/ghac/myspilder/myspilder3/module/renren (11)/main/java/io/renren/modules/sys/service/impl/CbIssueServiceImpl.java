package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CbIssueDao;
import io.renren.modules.sys.entity.CbIssueEntity;
import io.renren.modules.sys.service.CbIssueService;


@Service("cbIssueService")
public class CbIssueServiceImpl extends ServiceImpl<CbIssueDao, CbIssueEntity> implements CbIssueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CbIssueEntity> page = this.page(
                new Query<CbIssueEntity>().getPage(params),
                new QueryWrapper<CbIssueEntity>()
        );

        return new PageUtils(page);
    }

}
