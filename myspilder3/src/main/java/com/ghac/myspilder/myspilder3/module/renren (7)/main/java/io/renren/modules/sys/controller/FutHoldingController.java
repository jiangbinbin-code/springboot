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

import io.renren.modules.sys.entity.FutHoldingEntity;
import io.renren.modules.sys.service.FutHoldingService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/futholding")
public class FutHoldingController {
    @Autowired
    private FutHoldingService futHoldingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futholding:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futHoldingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futholding:info")
    public R info(@PathVariable("id") String id){
        FutHoldingEntity futHolding = futHoldingService.getById(id);

        return R.ok().put("futHolding", futHolding);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futholding:save")
    public R save(@RequestBody FutHoldingEntity futHolding){
        futHoldingService.save(futHolding);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futholding:update")
    public R update(@RequestBody FutHoldingEntity futHolding){
        ValidatorUtils.validateEntity(futHolding);
        futHoldingService.updateById(futHolding);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futholding:delete")
    public R delete(@RequestBody String[] ids){
        futHoldingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
