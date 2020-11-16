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

import io.renren.modules.sys.entity.GgtDailyEntity;
import io.renren.modules.sys.service.GgtDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
@RestController
@RequestMapping("sys/ggtdaily")
public class GgtDailyController {
    @Autowired
    private GgtDailyService ggtDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ggtdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ggtDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ggtdaily:info")
    public R info(@PathVariable("id") String id){
        GgtDailyEntity ggtDaily = ggtDailyService.getById(id);

        return R.ok().put("ggtDaily", ggtDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ggtdaily:save")
    public R save(@RequestBody GgtDailyEntity ggtDaily){
        ggtDailyService.save(ggtDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ggtdaily:update")
    public R update(@RequestBody GgtDailyEntity ggtDaily){
        ValidatorUtils.validateEntity(ggtDaily);
        ggtDailyService.updateById(ggtDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ggtdaily:delete")
    public R delete(@RequestBody String[] ids){
        ggtDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
