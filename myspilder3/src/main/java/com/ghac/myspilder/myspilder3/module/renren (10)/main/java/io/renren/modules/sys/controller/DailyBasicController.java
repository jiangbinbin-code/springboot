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

import io.renren.modules.sys.entity.DailyBasicEntity;
import io.renren.modules.sys.service.DailyBasicService;
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
@RequestMapping("sys/dailybasic")
public class DailyBasicController {
    @Autowired
    private DailyBasicService dailyBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dailybasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dailyBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dailybasic:info")
    public R info(@PathVariable("id") String id){
        DailyBasicEntity dailyBasic = dailyBasicService.getById(id);

        return R.ok().put("dailyBasic", dailyBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dailybasic:save")
    public R save(@RequestBody DailyBasicEntity dailyBasic){
        dailyBasicService.save(dailyBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dailybasic:update")
    public R update(@RequestBody DailyBasicEntity dailyBasic){
        ValidatorUtils.validateEntity(dailyBasic);
        dailyBasicService.updateById(dailyBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dailybasic:delete")
    public R delete(@RequestBody String[] ids){
        dailyBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
