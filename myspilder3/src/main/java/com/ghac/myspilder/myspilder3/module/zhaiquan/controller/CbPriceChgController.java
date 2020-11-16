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

import io.renren.modules.sys.entity.CbPriceChgEntity;
import io.renren.modules.sys.service.CbPriceChgService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:55
 */
@RestController
@RequestMapping("sys/cbpricechg")
public class CbPriceChgController {
    @Autowired
    private CbPriceChgService cbPriceChgService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cbpricechg:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cbPriceChgService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cbpricechg:info")
    public R info(@PathVariable("id") String id){
        CbPriceChgEntity cbPriceChg = cbPriceChgService.getById(id);

        return R.ok().put("cbPriceChg", cbPriceChg);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cbpricechg:save")
    public R save(@RequestBody CbPriceChgEntity cbPriceChg){
        cbPriceChgService.save(cbPriceChg);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cbpricechg:update")
    public R update(@RequestBody CbPriceChgEntity cbPriceChg){
        ValidatorUtils.validateEntity(cbPriceChg);
        cbPriceChgService.updateById(cbPriceChg);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cbpricechg:delete")
    public R delete(@RequestBody String[] ids){
        cbPriceChgService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
