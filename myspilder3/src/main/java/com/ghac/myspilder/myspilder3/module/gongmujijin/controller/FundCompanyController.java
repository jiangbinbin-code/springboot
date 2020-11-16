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

import io.renren.modules.sys.entity.FundCompanyEntity;
import io.renren.modules.sys.service.FundCompanyService;
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
@RequestMapping("sys/fundcompany")
public class FundCompanyController {
    @Autowired
    private FundCompanyService fundCompanyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundcompany:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundCompanyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundcompany:info")
    public R info(@PathVariable("id") String id){
        FundCompanyEntity fundCompany = fundCompanyService.getById(id);

        return R.ok().put("fundCompany", fundCompany);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundcompany:save")
    public R save(@RequestBody FundCompanyEntity fundCompany){
        fundCompanyService.save(fundCompany);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundcompany:update")
    public R update(@RequestBody FundCompanyEntity fundCompany){
        ValidatorUtils.validateEntity(fundCompany);
        fundCompanyService.updateById(fundCompany);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundcompany:delete")
    public R delete(@RequestBody String[] ids){
        fundCompanyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
