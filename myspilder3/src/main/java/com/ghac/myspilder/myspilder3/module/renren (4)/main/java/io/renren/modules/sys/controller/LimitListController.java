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

import io.renren.modules.sys.entity.LimitListEntity;
import io.renren.modules.sys.service.LimitListService;
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
@RequestMapping("sys/limitlist")
public class LimitListController {
    @Autowired
    private LimitListService limitListService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:limitlist:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = limitListService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:limitlist:info")
    public R info(@PathVariable("id") String id){
        LimitListEntity limitList = limitListService.getById(id);

        return R.ok().put("limitList", limitList);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:limitlist:save")
    public R save(@RequestBody LimitListEntity limitList){
        limitListService.save(limitList);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:limitlist:update")
    public R update(@RequestBody LimitListEntity limitList){
        ValidatorUtils.validateEntity(limitList);
        limitListService.updateById(limitList);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:limitlist:delete")
    public R delete(@RequestBody String[] ids){
        limitListService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
