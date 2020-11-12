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

import io.renren.modules.sys.entity.HkBasicEntity;
import io.renren.modules.sys.service.HkBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
@RestController
@RequestMapping("sys/hkbasic")
public class HkBasicController {
    @Autowired
    private HkBasicService hkBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hkbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hkBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hkbasic:info")
    public R info(@PathVariable("id") String id){
        HkBasicEntity hkBasic = hkBasicService.getById(id);

        return R.ok().put("hkBasic", hkBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hkbasic:save")
    public R save(@RequestBody HkBasicEntity hkBasic){
        hkBasicService.save(hkBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hkbasic:update")
    public R update(@RequestBody HkBasicEntity hkBasic){
        ValidatorUtils.validateEntity(hkBasic);
        hkBasicService.updateById(hkBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hkbasic:delete")
    public R delete(@RequestBody String[] ids){
        hkBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
