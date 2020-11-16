package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.entity.HkDailyEntity;
import io.renren.modules.sys.service.HkDailyService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
@RestController
@RequestMapping("sys/hkdaily")
public class HkDailyController {
    @Autowired
    private HkDailyService hkDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hkdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hkDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hkdaily:info")
    public R info(@PathVariable("id") String id){
        HkDailyEntity hkDaily = hkDailyService.getById(id);

        return R.ok().put("hkDaily", hkDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hkdaily:save")
    public R save(@RequestBody HkDailyEntity hkDaily){
        hkDailyService.save(hkDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hkdaily:update")
    public R update(@RequestBody HkDailyEntity hkDaily){
        ValidatorUtils.validateEntity(hkDaily);
        hkDailyService.updateById(hkDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hkdaily:delete")
    public R delete(@RequestBody String[] ids){
        hkDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
