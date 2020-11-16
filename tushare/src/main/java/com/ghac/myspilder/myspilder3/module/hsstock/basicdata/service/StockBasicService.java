package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.StockBasicEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
public interface StockBasicService extends IService<StockBasicEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

