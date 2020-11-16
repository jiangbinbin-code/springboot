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

import io.renren.modules.sys.entity.FinaMainbzEntity;
import io.renren.modules.sys.service.FinaMainbzService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/finamainbz")
public class FinaMainbzController {
    @Autowired
    private FinaMainbzService finaMainbzService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:finamainbz:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = finaMainbzService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:finamainbz:info")
    public R info(@PathVariable("id") String id){
        FinaMainbzEntity finaMainbz = finaMainbzService.getById(id);

        return R.ok().put("finaMainbz", finaMainbz);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:finamainbz:save")
    public R save(@RequestBody FinaMainbzEntity finaMainbz){
        finaMainbzService.save(finaMainbz);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:finamainbz:update")
    public R update(@RequestBody FinaMainbzEntity finaMainbz){
        ValidatorUtils.validateEntity(finaMainbz);
        finaMainbzService.updateById(finaMainbz);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:finamainbz:delete")
    public R delete(@RequestBody String[] ids){
        finaMainbzService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
