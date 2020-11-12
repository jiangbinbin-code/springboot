package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.QrtzFiredTriggersEntity;
import io.renren.modules.sys.service.QrtzFiredTriggersService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
@RestController
@RequestMapping("sys/qrtzfiredtriggers")
public class QrtzFiredTriggersController {
    @Autowired
    private QrtzFiredTriggersService qrtzFiredTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:qrtzfiredtriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzFiredTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("sys:qrtzfiredtriggers:info")
    public R info(@PathVariable("schedName") String schedName){
        QrtzFiredTriggersEntity qrtzFiredTriggers = qrtzFiredTriggersService.getById(schedName);

        return R.ok().put("qrtzFiredTriggers", qrtzFiredTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:qrtzfiredtriggers:save")
    public R save(@RequestBody QrtzFiredTriggersEntity qrtzFiredTriggers){
        qrtzFiredTriggersService.save(qrtzFiredTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:qrtzfiredtriggers:update")
    public R update(@RequestBody QrtzFiredTriggersEntity qrtzFiredTriggers){
        ValidatorUtils.validateEntity(qrtzFiredTriggers);
        qrtzFiredTriggersService.updateById(qrtzFiredTriggers);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:qrtzfiredtriggers:delete")
    public R delete(@RequestBody String[] schedNames){
        qrtzFiredTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
