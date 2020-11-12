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

import io.renren.modules.sys.entity.MarginEntity;
import io.renren.modules.sys.service.MarginService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/margin")
public class MarginController {
    @Autowired
    private MarginService marginService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:margin:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = marginService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:margin:info")
    public R info(@PathVariable("id") String id){
        MarginEntity margin = marginService.getById(id);

        return R.ok().put("margin", margin);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:margin:save")
    public R save(@RequestBody MarginEntity margin){
        marginService.save(margin);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:margin:update")
    public R update(@RequestBody MarginEntity margin){
        ValidatorUtils.validateEntity(margin);
        marginService.updateById(margin);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:margin:delete")
    public R delete(@RequestBody String[] ids){
        marginService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
