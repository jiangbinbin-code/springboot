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

import io.renren.modules.sys.entity.FutBasicEntity;
import io.renren.modules.sys.service.FutBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/futbasic")
public class FutBasicController {
    @Autowired
    private FutBasicService futBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futbasic:info")
    public R info(@PathVariable("id") String id){
        FutBasicEntity futBasic = futBasicService.getById(id);

        return R.ok().put("futBasic", futBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futbasic:save")
    public R save(@RequestBody FutBasicEntity futBasic){
        futBasicService.save(futBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futbasic:update")
    public R update(@RequestBody FutBasicEntity futBasic){
        ValidatorUtils.validateEntity(futBasic);
        futBasicService.updateById(futBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futbasic:delete")
    public R delete(@RequestBody String[] ids){
        futBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
