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

import io.renren.modules.sys.entity.DailyInfoEntity;
import io.renren.modules.sys.service.DailyInfoService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:54
 */
@RestController
@RequestMapping("sys/dailyinfo")
public class DailyInfoController {
    @Autowired
    private DailyInfoService dailyInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dailyinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dailyInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dailyinfo:info")
    public R info(@PathVariable("id") String id){
        DailyInfoEntity dailyInfo = dailyInfoService.getById(id);

        return R.ok().put("dailyInfo", dailyInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dailyinfo:save")
    public R save(@RequestBody DailyInfoEntity dailyInfo){
        dailyInfoService.save(dailyInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dailyinfo:update")
    public R update(@RequestBody DailyInfoEntity dailyInfo){
        ValidatorUtils.validateEntity(dailyInfo);
        dailyInfoService.updateById(dailyInfo);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dailyinfo:delete")
    public R delete(@RequestBody String[] ids){
        dailyInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
