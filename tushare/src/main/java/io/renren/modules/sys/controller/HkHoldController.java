package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.entity.HkHoldEntity;
import io.renren.modules.sys.service.HkHoldService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
@RestController
@RequestMapping("sys/hkhold")
public class HkHoldController {
    @Autowired
    private HkHoldService hkHoldService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hkhold:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hkHoldService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hkhold:info")
    public R info(@PathVariable("id") String id){
        HkHoldEntity hkHold = hkHoldService.getById(id);

        return R.ok().put("hkHold", hkHold);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hkhold:save")
    public R save(@RequestBody HkHoldEntity hkHold){
        hkHoldService.save(hkHold);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hkhold:update")
    public R update(@RequestBody HkHoldEntity hkHold){
        ValidatorUtils.validateEntity(hkHold);
        hkHoldService.updateById(hkHold);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hkhold:delete")
    public R delete(@RequestBody String[] ids){
        hkHoldService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
