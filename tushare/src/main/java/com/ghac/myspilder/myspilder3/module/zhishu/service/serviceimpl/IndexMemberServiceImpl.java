package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.ghac.myspilder.myspilder3.module.zhishu.dao.DailyInfoDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghac.myspilder.myspilder3.module.zhishu.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;



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
