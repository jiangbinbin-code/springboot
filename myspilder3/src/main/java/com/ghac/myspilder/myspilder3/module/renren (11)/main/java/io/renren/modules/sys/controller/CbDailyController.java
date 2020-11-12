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

import io.renren.modules.sys.entity.CbDailyEntity;
import io.renren.modules.sys.service.CbDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cbdaily")
public class CbDailyController {
    @Autowired
    private CbDailyService cbDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cbdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cbDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cbdaily:info")
    public R info(@PathVariable("id") String id){
        CbDailyEntity cbDaily = cbDailyService.getById(id);

        return R.ok().put("cbDaily", cbDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cbdaily:save")
    public R save(@RequestBody CbDailyEntity cbDaily){
        cbDailyService.save(cbDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cbdaily:update")
    public R update(@RequestBody CbDailyEntity cbDaily){
        ValidatorUtils.validateEntity(cbDaily);
        cbDailyService.updateById(cbDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cbdaily:delete")
    public R delete(@RequestBody String[] ids){
        cbDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
