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

import io.renren.modules.sys.entity.FundBasicEntity;
import io.renren.modules.sys.service.FundBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/fundbasic")
public class FundBasicController {
    @Autowired
    private FundBasicService fundBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundbasic:info")
    public R info(@PathVariable("id") String id){
        FundBasicEntity fundBasic = fundBasicService.getById(id);

        return R.ok().put("fundBasic", fundBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundbasic:save")
    public R save(@RequestBody FundBasicEntity fundBasic){
        fundBasicService.save(fundBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundbasic:update")
    public R update(@RequestBody FundBasicEntity fundBasic){
        ValidatorUtils.validateEntity(fundBasic);
        fundBasicService.updateById(fundBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundbasic:delete")
    public R delete(@RequestBody String[] ids){
        fundBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
