package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.TmtTwincomedetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
public interface TmtTwincomedetailService extends IService<TmtTwincomedetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

