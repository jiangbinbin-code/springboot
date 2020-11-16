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

import io.renren.modules.sys.entity.ShareFloatEntity;
import io.renren.modules.sys.service.ShareFloatService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:15
 */
@RestController
@RequestMapping("sys/sharefloat")
public class ShareFloatController {
    @Autowired
    private ShareFloatService shareFloatService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:sharefloat:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shareFloatService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:sharefloat:info")
    public R info(@PathVariable("id") String id){
        ShareFloatEntity shareFloat = shareFloatService.getById(id);

        return R.ok().put("shareFloat", shareFloat);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:sharefloat:save")
    public R save(@RequestBody ShareFloatEntity shareFloat){
        shareFloatService.save(shareFloat);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:sharefloat:update")
    public R update(@RequestBody ShareFloatEntity shareFloat){
        ValidatorUtils.validateEntity(shareFloat);
        shareFloatService.updateById(shareFloat);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:sharefloat:delete")
    public R delete(@RequestBody String[] ids){
        shareFloatService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
