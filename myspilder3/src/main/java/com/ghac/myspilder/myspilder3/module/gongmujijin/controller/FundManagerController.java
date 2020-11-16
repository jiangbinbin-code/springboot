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

import io.renren.modules.sys.entity.FundManagerEntity;
import io.renren.modules.sys.service.FundManagerService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/fundmanager")
public class FundManagerController {
    @Autowired
    private FundManagerService fundManagerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundmanager:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundManagerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundmanager:info")
    public R info(@PathVariable("id") String id){
        FundManagerEntity fundManager = fundManagerService.getById(id);

        return R.ok().put("fundManager", fundManager);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundmanager:save")
    public R save(@RequestBody FundManagerEntity fundManager){
        fundManagerService.save(fundManager);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundmanager:update")
    public R update(@RequestBody FundManagerEntity fundManager){
        ValidatorUtils.validateEntity(fundManager);
        fundManagerService.updateById(fundManager);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundmanager:delete")
    public R delete(@RequestBody String[] ids){
        fundManagerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
