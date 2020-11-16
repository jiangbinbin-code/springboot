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

import io.renren.modules.sys.entity.ShiborEntity;
import io.renren.modules.sys.service.ShiborService;
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
@RequestMapping("sys/shibor")
public class ShiborController {
    @Autowired
    private ShiborService shiborService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:shibor:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shiborService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:shibor:info")
    public R info(@PathVariable("id") String id){
        ShiborEntity shibor = shiborService.getById(id);

        return R.ok().put("shibor", shibor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:shibor:save")
    public R save(@RequestBody ShiborEntity shibor){
        shiborService.save(shibor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:shibor:update")
    public R update(@RequestBody ShiborEntity shibor){
        ValidatorUtils.validateEntity(shibor);
        shiborService.updateById(shibor);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:shibor:delete")
    public R delete(@RequestBody String[] ids){
        shiborService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
