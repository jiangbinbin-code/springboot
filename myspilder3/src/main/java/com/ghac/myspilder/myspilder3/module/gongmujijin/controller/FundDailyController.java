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

import io.renren.modules.sys.entity.FundDailyEntity;
import io.renren.modules.sys.service.FundDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/funddaily")
public class FundDailyController {
    @Autowired
    private FundDailyService fundDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:funddaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:funddaily:info")
    public R info(@PathVariable("id") String id){
        FundDailyEntity fundDaily = fundDailyService.getById(id);

        return R.ok().put("fundDaily", fundDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:funddaily:save")
    public R save(@RequestBody FundDailyEntity fundDaily){
        fundDailyService.save(fundDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:funddaily:update")
    public R update(@RequestBody FundDailyEntity fundDaily){
        ValidatorUtils.validateEntity(fundDaily);
        fundDailyService.updateById(fundDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:funddaily:delete")
    public R delete(@RequestBody String[] ids){
        fundDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
