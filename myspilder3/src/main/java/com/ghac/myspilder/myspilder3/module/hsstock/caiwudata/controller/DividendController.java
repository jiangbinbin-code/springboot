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

import io.renren.modules.sys.entity.DividendEntity;
import io.renren.modules.sys.service.DividendService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:49
 */
@RestController
@RequestMapping("sys/dividend")
public class DividendController {
    @Autowired
    private DividendService dividendService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dividend:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dividendService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dividend:info")
    public R info(@PathVariable("id") String id){
        DividendEntity dividend = dividendService.getById(id);

        return R.ok().put("dividend", dividend);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dividend:save")
    public R save(@RequestBody DividendEntity dividend){
        dividendService.save(dividend);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dividend:update")
    public R update(@RequestBody DividendEntity dividend){
        ValidatorUtils.validateEntity(dividend);
        dividendService.updateById(dividend);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dividend:delete")
    public R delete(@RequestBody String[] ids){
        dividendService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
