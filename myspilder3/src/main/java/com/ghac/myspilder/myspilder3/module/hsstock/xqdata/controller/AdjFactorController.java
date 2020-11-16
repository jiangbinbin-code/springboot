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

import io.renren.modules.sys.entity.AdjFactorEntity;
import io.renren.modules.sys.service.AdjFactorService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/adjfactor")
public class AdjFactorController {
    @Autowired
    private AdjFactorService adjFactorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:adjfactor:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adjFactorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:adjfactor:info")
    public R info(@PathVariable("id") String id){
        AdjFactorEntity adjFactor = adjFactorService.getById(id);

        return R.ok().put("adjFactor", adjFactor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:adjfactor:save")
    public R save(@RequestBody AdjFactorEntity adjFactor){
        adjFactorService.save(adjFactor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:adjfactor:update")
    public R update(@RequestBody AdjFactorEntity adjFactor){
        ValidatorUtils.validateEntity(adjFactor);
        adjFactorService.updateById(adjFactor);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:adjfactor:delete")
    public R delete(@RequestBody String[] ids){
        adjFactorService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
