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

import io.renren.modules.sys.entity.RepoDailyEntity;
import io.renren.modules.sys.service.RepoDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@RestController
@RequestMapping("sys/repodaily")
public class RepoDailyController {
    @Autowired
    private RepoDailyService repoDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:repodaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = repoDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:repodaily:info")
    public R info(@PathVariable("id") String id){
        RepoDailyEntity repoDaily = repoDailyService.getById(id);

        return R.ok().put("repoDaily", repoDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:repodaily:save")
    public R save(@RequestBody RepoDailyEntity repoDaily){
        repoDailyService.save(repoDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:repodaily:update")
    public R update(@RequestBody RepoDailyEntity repoDaily){
        ValidatorUtils.validateEntity(repoDaily);
        repoDailyService.updateById(repoDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:repodaily:delete")
    public R delete(@RequestBody String[] ids){
        repoDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
