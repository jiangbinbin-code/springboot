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

import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.StockBasicEntity;
import io.renren.modules.sys.service.StockBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/stockbasic")
public class StockBasicController {
    @Autowired
    private StockBasicService stockBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stockbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stockBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stockbasic:info")
    public R info(@PathVariable("id") String id){
        StockBasicEntity stockBasic = stockBasicService.getById(id);

        return R.ok().put("stockBasic", stockBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stockbasic:save")
    public R save(@RequestBody StockBasicEntity stockBasic){
        stockBasicService.save(stockBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stockbasic:update")
    public R update(@RequestBody StockBasicEntity stockBasic){
        ValidatorUtils.validateEntity(stockBasic);
        stockBasicService.updateById(stockBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stockbasic:delete")
    public R delete(@RequestBody String[] ids){
        stockBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
