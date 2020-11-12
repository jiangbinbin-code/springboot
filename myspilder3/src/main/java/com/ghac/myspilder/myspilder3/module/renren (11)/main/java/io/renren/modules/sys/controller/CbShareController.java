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

import io.renren.modules.sys.entity.CbShareEntity;
import io.renren.modules.sys.service.CbShareService;
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
@RequestMapping("sys/cbshare")
public class CbShareController {
    @Autowired
    private CbShareService cbShareService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cbshare:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cbShareService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cbshare:info")
    public R info(@PathVariable("id") String id){
        CbShareEntity cbShare = cbShareService.getById(id);

        return R.ok().put("cbShare", cbShare);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cbshare:save")
    public R save(@RequestBody CbShareEntity cbShare){
        cbShareService.save(cbShare);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cbshare:update")
    public R update(@RequestBody CbShareEntity cbShare){
        ValidatorUtils.validateEntity(cbShare);
        cbShareService.updateById(cbShare);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cbshare:delete")
    public R delete(@RequestBody String[] ids){
        cbShareService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
