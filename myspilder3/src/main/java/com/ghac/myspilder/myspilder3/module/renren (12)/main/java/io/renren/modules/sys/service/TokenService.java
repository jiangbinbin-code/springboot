package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.TokenEntity;

import java.util.Map;

/**
 * 用户Token
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
public interface TokenService extends IService<TokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

