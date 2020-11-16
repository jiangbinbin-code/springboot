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

import io.renren.modules.sys.entity.ProBarEntity;
import io.renren.modules.sys.service.ProBarService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@RestController
@RequestMapping("sys/probar")
public class ProBarController {
    @Autowired
    private ProBarService proBarService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:probar:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = proBarService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:probar:info")
    public R info(@PathVariable("id") String id){
        ProBarEntity proBar = proBarService.getById(id);

        return R.ok().put("proBar", proBar);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:probar:save")
    public R save(@RequestBody ProBarEntity proBar){
        proBarService.save(proBar);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:probar:update")
    public R update(@RequestBody ProBarEntity proBar){
        ValidatorUtils.validateEntity(proBar);
        proBarService.updateById(proBar);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:probar:delete")
    public R delete(@RequestBody String[] ids){
        proBarService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
