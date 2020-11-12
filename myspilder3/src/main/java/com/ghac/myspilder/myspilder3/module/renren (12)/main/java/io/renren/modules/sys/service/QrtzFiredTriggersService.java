package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.QrtzFiredTriggersEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
public interface QrtzFiredTriggersService extends IService<QrtzFiredTriggersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

