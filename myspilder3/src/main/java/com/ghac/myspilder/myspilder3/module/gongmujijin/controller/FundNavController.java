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

import io.renren.modules.sys.entity.FundNavEntity;
import io.renren.modules.sys.service.FundNavService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/fundnav")
public class FundNavController {
    @Autowired
    private FundNavService fundNavService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundnav:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundNavService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundnav:info")
    public R info(@PathVariable("id") String id){
        FundNavEntity fundNav = fundNavService.getById(id);

        return R.ok().put("fundNav", fundNav);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundnav:save")
    public R save(@RequestBody FundNavEntity fundNav){
        fundNavService.save(fundNav);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundnav:update")
    public R update(@RequestBody FundNavEntity fundNav){
        ValidatorUtils.validateEntity(fundNav);
        fundNavService.updateById(fundNav);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundnav:delete")
    public R delete(@RequestBody String[] ids){
        fundNavService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
