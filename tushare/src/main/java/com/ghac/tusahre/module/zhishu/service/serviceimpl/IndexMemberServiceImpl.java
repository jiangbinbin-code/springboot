package com.ghac.tusahre.module.zhishu.service.serviceimpl;

import com.ghac.tusahre.module.zhishu.dao.IndexMemberDao;
import org.springframework.stereotype.Service;
import com.ghac.tusahre.module.zhishu.entity.IndexMemberEntity;
import com.ghac.tusahre.module.zhishu.service.IndexMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("indexMemberService")
public class IndexMemberServiceImpl extends ServiceImpl<IndexMemberDao, IndexMemberEntity> implements IndexMemberService {

}
