package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.TokenDao;
import io.renren.modules.sys.entity.TokenEntity;
import io.renren.modules.sys.service.TokenService;


@Service("tokenService")
public class TokenServiceImpl extends ServiceImpl<TokenDao, TokenEntity> implements TokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TokenEntity> page = this.page(
                new Query<TokenEntity>().getPage(params),
                new QueryWrapper<TokenEntity>()
        );

        return new PageUtils(page);
    }

}
