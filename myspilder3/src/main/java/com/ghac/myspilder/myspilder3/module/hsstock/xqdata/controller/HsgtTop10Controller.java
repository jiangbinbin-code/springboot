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

import io.renren.modules.sys.entity.HsgtTop10Entity;
import io.renren.modules.sys.service.HsgtTop10Service;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@RestController
@RequestMapping("sys/hsgttop10")
public class HsgtTop10Controller {
    @Autowired
    private HsgtTop10Service hsgtTop10Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hsgttop10:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hsgtTop10Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hsgttop10:info")
    public R info(@PathVariable("id") String id){
        HsgtTop10Entity hsgtTop10 = hsgtTop10Service.getById(id);

        return R.ok().put("hsgtTop10", hsgtTop10);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hsgttop10:save")
    public R save(@RequestBody HsgtTop10Entity hsgtTop10){
        hsgtTop10Service.save(hsgtTop10);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hsgttop10:update")
    public R update(@RequestBody HsgtTop10Entity hsgtTop10){
        ValidatorUtils.validateEntity(hsgtTop10);
        hsgtTop10Service.updateById(hsgtTop10);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hsgttop10:delete")
    public R delete(@RequestBody String[] ids){
        hsgtTop10Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
