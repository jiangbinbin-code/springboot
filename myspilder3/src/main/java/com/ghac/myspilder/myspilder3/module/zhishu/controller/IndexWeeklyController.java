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

import io.renren.modules.sys.entity.IndexWeeklyEntity;
import io.renren.modules.sys.service.IndexWeeklyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:26
 */
@RestController
@RequestMapping("sys/indexweekly")
public class IndexWeeklyController {
    @Autowired
    private IndexWeeklyService indexWeeklyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexweekly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexWeeklyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexweekly:info")
    public R info(@PathVariable("id") String id){
        IndexWeeklyEntity indexWeekly = indexWeeklyService.getById(id);

        return R.ok().put("indexWeekly", indexWeekly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexweekly:save")
    public R save(@RequestBody IndexWeeklyEntity indexWeekly){
        indexWeeklyService.save(indexWeekly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexweekly:update")
    public R update(@RequestBody IndexWeeklyEntity indexWeekly){
        ValidatorUtils.validateEntity(indexWeekly);
        indexWeeklyService.updateById(indexWeekly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexweekly:delete")
    public R delete(@RequestBody String[] ids){
        indexWeeklyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
