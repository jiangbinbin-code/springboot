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

import io.renren.modules.sys.entity.EcoCalEntity;
import io.renren.modules.sys.service.EcoCalService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:49
 */
@RestController
@RequestMapping("sys/ecocal")
public class EcoCalController {
    @Autowired
    private EcoCalService ecoCalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ecocal:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ecoCalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ecocal:info")
    public R info(@PathVariable("id") String id){
        EcoCalEntity ecoCal = ecoCalService.getById(id);

        return R.ok().put("ecoCal", ecoCal);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ecocal:save")
    public R save(@RequestBody EcoCalEntity ecoCal){
        ecoCalService.save(ecoCal);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ecocal:update")
    public R update(@RequestBody EcoCalEntity ecoCal){
        ValidatorUtils.validateEntity(ecoCal);
        ecoCalService.updateById(ecoCal);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ecocal:delete")
    public R delete(@RequestBody String[] ids){
        ecoCalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
