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

import io.renren.modules.sys.entity.FundPortfolioEntity;
import io.renren.modules.sys.service.FundPortfolioService;
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
@RequestMapping("sys/fundportfolio")
public class FundPortfolioController {
    @Autowired
    private FundPortfolioService fundPortfolioService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundportfolio:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundPortfolioService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundportfolio:info")
    public R info(@PathVariable("id") String id){
        FundPortfolioEntity fundPortfolio = fundPortfolioService.getById(id);

        return R.ok().put("fundPortfolio", fundPortfolio);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundportfolio:save")
    public R save(@RequestBody FundPortfolioEntity fundPortfolio){
        fundPortfolioService.save(fundPortfolio);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundportfolio:update")
    public R update(@RequestBody FundPortfolioEntity fundPortfolio){
        ValidatorUtils.validateEntity(fundPortfolio);
        fundPortfolioService.updateById(fundPortfolio);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundportfolio:delete")
    public R delete(@RequestBody String[] ids){
        fundPortfolioService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
