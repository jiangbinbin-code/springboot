package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.UserEntity;

import java.util.Map;

/**
 * 用户
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

