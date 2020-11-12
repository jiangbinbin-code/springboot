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

import io.renren.modules.sys.entity.UsDailyEntity;
import io.renren.modules.sys.service.UsDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/usdaily")
public class UsDailyController {
    @Autowired
    private UsDailyService usDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:usdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:usdaily:info")
    public R info(@PathVariable("id") String id){
        UsDailyEntity usDaily = usDailyService.getById(id);

        return R.ok().put("usDaily", usDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:usdaily:save")
    public R save(@RequestBody UsDailyEntity usDaily){
        usDailyService.save(usDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:usdaily:update")
    public R update(@RequestBody UsDailyEntity usDaily){
        ValidatorUtils.validateEntity(usDaily);
        usDailyService.updateById(usDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:usdaily:delete")
    public R delete(@RequestBody String[] ids){
        usDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
