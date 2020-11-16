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

import io.renren.modules.sys.entity.IndexMonthlyEntity;
import io.renren.modules.sys.service.IndexMonthlyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:27
 */
@RestController
@RequestMapping("sys/indexmonthly")
public class IndexMonthlyController {
    @Autowired
    private IndexMonthlyService indexMonthlyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexmonthly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexMonthlyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexmonthly:info")
    public R info(@PathVariable("id") String id){
        IndexMonthlyEntity indexMonthly = indexMonthlyService.getById(id);

        return R.ok().put("indexMonthly", indexMonthly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexmonthly:save")
    public R save(@RequestBody IndexMonthlyEntity indexMonthly){
        indexMonthlyService.save(indexMonthly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexmonthly:update")
    public R update(@RequestBody IndexMonthlyEntity indexMonthly){
        ValidatorUtils.validateEntity(indexMonthly);
        indexMonthlyService.updateById(indexMonthly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexmonthly:delete")
    public R delete(@RequestBody String[] ids){
        indexMonthlyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
