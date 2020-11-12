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

import io.renren.modules.sys.entity.UsTltrEntity;
import io.renren.modules.sys.service.UsTltrService;
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
@RequestMapping("sys/ustltr")
public class UsTltrController {
    @Autowired
    private UsTltrService usTltrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustltr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTltrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustltr:info")
    public R info(@PathVariable("id") String id){
        UsTltrEntity usTltr = usTltrService.getById(id);

        return R.ok().put("usTltr", usTltr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustltr:save")
    public R save(@RequestBody UsTltrEntity usTltr){
        usTltrService.save(usTltr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustltr:update")
    public R update(@RequestBody UsTltrEntity usTltr){
        ValidatorUtils.validateEntity(usTltr);
        usTltrService.updateById(usTltr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustltr:delete")
    public R delete(@RequestBody String[] ids){
        usTltrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
