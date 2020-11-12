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

import io.renren.modules.sys.entity.AnnsEntity;
import io.renren.modules.sys.service.AnnsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/anns")
public class AnnsController {
    @Autowired
    private AnnsService annsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:anns:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = annsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:anns:info")
    public R info(@PathVariable("id") String id){
        AnnsEntity anns = annsService.getById(id);

        return R.ok().put("anns", anns);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:anns:save")
    public R save(@RequestBody AnnsEntity anns){
        annsService.save(anns);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:anns:update")
    public R update(@RequestBody AnnsEntity anns){
        ValidatorUtils.validateEntity(anns);
        annsService.updateById(anns);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:anns:delete")
    public R delete(@RequestBody String[] ids){
        annsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
