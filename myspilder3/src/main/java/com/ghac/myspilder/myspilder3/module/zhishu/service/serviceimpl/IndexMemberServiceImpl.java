package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.IndexMemberDao;
import io.renren.modules.sys.entity.IndexMemberEntity;
import io.renren.modules.sys.service.IndexMemberService;


@Service("indexMemberService")
public class IndexMemberServiceImpl extends ServiceImpl<IndexMemberDao, IndexMemberEntity> implements IndexMemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IndexMemberEntity> page = this.page(
                new Query<IndexMemberEntity>().getPage(params),
                new QueryWrapper<IndexMemberEntity>()
        );

        return new PageUtils(page);
    }

}
