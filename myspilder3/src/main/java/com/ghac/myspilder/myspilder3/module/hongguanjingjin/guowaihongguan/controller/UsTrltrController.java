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

import io.renren.modules.sys.entity.UsTrltrEntity;
import io.renren.modules.sys.service.UsTrltrService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/ustrltr")
public class UsTrltrController {
    @Autowired
    private UsTrltrService usTrltrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustrltr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTrltrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustrltr:info")
    public R info(@PathVariable("id") String id){
        UsTrltrEntity usTrltr = usTrltrService.getById(id);

        return R.ok().put("usTrltr", usTrltr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustrltr:save")
    public R save(@RequestBody UsTrltrEntity usTrltr){
        usTrltrService.save(usTrltr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustrltr:update")
    public R update(@RequestBody UsTrltrEntity usTrltr){
        ValidatorUtils.validateEntity(usTrltr);
        usTrltrService.updateById(usTrltr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustrltr:delete")
    public R delete(@RequestBody String[] ids){
        usTrltrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
