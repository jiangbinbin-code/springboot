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

import io.renren.modules.sys.entity.ConceptEntity;
import io.renren.modules.sys.service.ConceptService;
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
@RequestMapping("sys/concept")
public class ConceptController {
    @Autowired
    private ConceptService conceptService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:concept:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = conceptService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:concept:info")
    public R info(@PathVariable("id") String id){
        ConceptEntity concept = conceptService.getById(id);

        return R.ok().put("concept", concept);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:concept:save")
    public R save(@RequestBody ConceptEntity concept){
        conceptService.save(concept);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:concept:update")
    public R update(@RequestBody ConceptEntity concept){
        ValidatorUtils.validateEntity(concept);
        conceptService.updateById(concept);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:concept:delete")
    public R delete(@RequestBody String[] ids){
        conceptService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}