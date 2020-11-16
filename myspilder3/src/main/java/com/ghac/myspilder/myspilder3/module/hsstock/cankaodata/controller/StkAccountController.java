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

import io.renren.modules.sys.entity.StkAccountEntity;
import io.renren.modules.sys.service.StkAccountService;
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
@RequestMapping("sys/stkaccount")
public class StkAccountController {
    @Autowired
    private StkAccountService stkAccountService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkaccount:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkAccountService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkaccount:info")
    public R info(@PathVariable("id") String id){
        StkAccountEntity stkAccount = stkAccountService.getById(id);

        return R.ok().put("stkAccount", stkAccount);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkaccount:save")
    public R save(@RequestBody StkAccountEntity stkAccount){
        stkAccountService.save(stkAccount);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkaccount:update")
    public R update(@RequestBody StkAccountEntity stkAccount){
        ValidatorUtils.validateEntity(stkAccount);
        stkAccountService.updateById(stkAccount);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkaccount:delete")
    public R delete(@RequestBody String[] ids){
        stkAccountService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
