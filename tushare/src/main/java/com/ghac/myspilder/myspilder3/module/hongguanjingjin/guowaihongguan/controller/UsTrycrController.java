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

import io.renren.modules.sys.entity.UsTrycrEntity;
import io.renren.modules.sys.service.UsTrycrService;
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
@RequestMapping("sys/ustrycr")
public class UsTrycrController {
    @Autowired
    private UsTrycrService usTrycrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustrycr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTrycrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustrycr:info")
    public R info(@PathVariable("id") String id){
        UsTrycrEntity usTrycr = usTrycrService.getById(id);

        return R.ok().put("usTrycr", usTrycr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustrycr:save")
    public R save(@RequestBody UsTrycrEntity usTrycr){
        usTrycrService.save(usTrycr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustrycr:update")
    public R update(@RequestBody UsTrycrEntity usTrycr){
        ValidatorUtils.validateEntity(usTrycr);
        usTrycrService.updateById(usTrycr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustrycr:delete")
    public R delete(@RequestBody String[] ids){
        usTrycrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
