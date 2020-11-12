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

import io.renren.modules.sys.entity.StockCompanyEntity;
import io.renren.modules.sys.service.StockCompanyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:10
 */
@RestController
@RequestMapping("sys/stockcompany")
public class StockCompanyController {
    @Autowired
    private StockCompanyService stockCompanyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stockcompany:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stockCompanyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stockcompany:info")
    public R info(@PathVariable("id") String id){
        StockCompanyEntity stockCompany = stockCompanyService.getById(id);

        return R.ok().put("stockCompany", stockCompany);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stockcompany:save")
    public R save(@RequestBody StockCompanyEntity stockCompany){
        stockCompanyService.save(stockCompany);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stockcompany:update")
    public R update(@RequestBody StockCompanyEntity stockCompany){
        ValidatorUtils.validateEntity(stockCompany);
        stockCompanyService.updateById(stockCompany);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stockcompany:delete")
    public R delete(@RequestBody String[] ids){
        stockCompanyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
