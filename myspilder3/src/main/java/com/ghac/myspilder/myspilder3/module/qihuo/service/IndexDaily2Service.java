package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.IndexDaily2Entity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
public interface IndexDaily2Service extends IService<IndexDaily2Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

