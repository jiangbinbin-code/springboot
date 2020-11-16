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

import io.renren.modules.sys.entity.GgtMonthlyEntity;
import io.renren.modules.sys.service.GgtMonthlyService;
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
@RequestMapping("sys/ggtmonthly")
public class GgtMonthlyController {
    @Autowired
    private GgtMonthlyService ggtMonthlyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ggtmonthly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ggtMonthlyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ggtmonthly:info")
    public R info(@PathVariable("id") String id){
        GgtMonthlyEntity ggtMonthly = ggtMonthlyService.getById(id);

        return R.ok().put("ggtMonthly", ggtMonthly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ggtmonthly:save")
    public R save(@RequestBody GgtMonthlyEntity ggtMonthly){
        ggtMonthlyService.save(ggtMonthly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ggtmonthly:update")
    public R update(@RequestBody GgtMonthlyEntity ggtMonthly){
        ValidatorUtils.validateEntity(ggtMonthly);
        ggtMonthlyService.updateById(ggtMonthly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ggtmonthly:delete")
    public R delete(@RequestBody String[] ids){
        ggtMonthlyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
