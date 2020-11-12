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

import io.renren.modules.sys.entity.GzIndexEntity;
import io.renren.modules.sys.service.GzIndexService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:38
 */
@RestController
@RequestMapping("sys/gzindex")
public class GzIndexController {
    @Autowired
    private GzIndexService gzIndexService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:gzindex:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gzIndexService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:gzindex:info")
    public R info(@PathVariable("id") String id){
        GzIndexEntity gzIndex = gzIndexService.getById(id);

        return R.ok().put("gzIndex", gzIndex);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:gzindex:save")
    public R save(@RequestBody GzIndexEntity gzIndex){
        gzIndexService.save(gzIndex);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:gzindex:update")
    public R update(@RequestBody GzIndexEntity gzIndex){
        ValidatorUtils.validateEntity(gzIndex);
        gzIndexService.updateById(gzIndex);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:gzindex:delete")
    public R delete(@RequestBody String[] ids){
        gzIndexService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
