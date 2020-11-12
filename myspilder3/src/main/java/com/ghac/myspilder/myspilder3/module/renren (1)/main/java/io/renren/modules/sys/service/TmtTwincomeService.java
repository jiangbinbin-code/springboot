package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.TmtTwincomeEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
public interface TmtTwincomeService extends IService<TmtTwincomeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

