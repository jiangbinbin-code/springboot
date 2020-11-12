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

import io.renren.modules.sys.entity.QrtzTriggersEntity;
import io.renren.modules.sys.service.QrtzTriggersService;
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
@RequestMapping("sys/qrtztriggers")
public class QrtzTriggersController {
    @Autowired
    private QrtzTriggersService qrtzTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:qrtztriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("sys:qrtztriggers:info")
    public R info(@PathVariable("schedName") String schedName){
        QrtzTriggersEntity qrtzTriggers = qrtzTriggersService.getById(schedName);

        return R.ok().put("qrtzTriggers", qrtzTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:qrtztriggers:save")
    public R save(@RequestBody QrtzTriggersEntity qrtzTriggers){
        qrtzTriggersService.save(qrtzTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:qrtztriggers:update")
    public R update(@RequestBody QrtzTriggersEntity qrtzTriggers){
        ValidatorUtils.validateEntity(qrtzTriggers);
        qrtzTriggersService.updateById(qrtzTriggers);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:qrtztriggers:delete")
    public R delete(@RequestBody String[] schedNames){
        qrtzTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
