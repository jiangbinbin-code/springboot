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

import io.renren.modules.sys.entity.CbBasicEntity;
import io.renren.modules.sys.service.CbBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cbbasic")
public class CbBasicController {
    @Autowired
    private CbBasicService cbBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cbbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cbBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cbbasic:info")
    public R info(@PathVariable("id") String id){
        CbBasicEntity cbBasic = cbBasicService.getById(id);

        return R.ok().put("cbBasic", cbBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cbbasic:save")
    public R save(@RequestBody CbBasicEntity cbBasic){
        cbBasicService.save(cbBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cbbasic:update")
    public R update(@RequestBody CbBasicEntity cbBasic){
        ValidatorUtils.validateEntity(cbBasic);
        cbBasicService.updateById(cbBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cbbasic:delete")
    public R delete(@RequestBody String[] ids){
        cbBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
