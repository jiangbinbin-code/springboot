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

import io.renren.modules.sys.entity.UsBasicEntity;
import io.renren.modules.sys.service.UsBasicService;
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
@RequestMapping("sys/usbasic")
public class UsBasicController {
    @Autowired
    private UsBasicService usBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:usbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:usbasic:info")
    public R info(@PathVariable("id") String id){
        UsBasicEntity usBasic = usBasicService.getById(id);

        return R.ok().put("usBasic", usBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:usbasic:save")
    public R save(@RequestBody UsBasicEntity usBasic){
        usBasicService.save(usBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:usbasic:update")
    public R update(@RequestBody UsBasicEntity usBasic){
        ValidatorUtils.validateEntity(usBasic);
        usBasicService.updateById(usBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:usbasic:delete")
    public R delete(@RequestBody String[] ids){
        usBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
