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

import io.renren.modules.sys.entity.TradeCalEntity;
import io.renren.modules.sys.service.TradeCalService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/tradecal")
public class TradeCalController {
    @Autowired
    private TradeCalService tradeCalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:tradecal:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tradeCalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:tradecal:info")
    public R info(@PathVariable("id") String id){
        TradeCalEntity tradeCal = tradeCalService.getById(id);

        return R.ok().put("tradeCal", tradeCal);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:tradecal:save")
    public R save(@RequestBody TradeCalEntity tradeCal){
        tradeCalService.save(tradeCal);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:tradecal:update")
    public R update(@RequestBody TradeCalEntity tradeCal){
        ValidatorUtils.validateEntity(tradeCal);
        tradeCalService.updateById(tradeCal);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:tradecal:delete")
    public R delete(@RequestBody String[] ids){
        tradeCalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
