package com.ghac.myspilder.myspilder3.module.gangstock.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.HkBasicEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
public interface HkBasicService extends IService<HkBasicEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

