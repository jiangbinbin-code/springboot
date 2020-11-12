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

import io.renren.modules.sys.entity.HkTradecalEntity;
import io.renren.modules.sys.service.HkTradecalService;
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
@RequestMapping("sys/hktradecal")
public class HkTradecalController {
    @Autowired
    private HkTradecalService hkTradecalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hktradecal:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hkTradecalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hktradecal:info")
    public R info(@PathVariable("id") String id){
        HkTradecalEntity hkTradecal = hkTradecalService.getById(id);

        return R.ok().put("hkTradecal", hkTradecal);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hktradecal:save")
    public R save(@RequestBody HkTradecalEntity hkTradecal){
        hkTradecalService.save(hkTradecal);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hktradecal:update")
    public R update(@RequestBody HkTradecalEntity hkTradecal){
        ValidatorUtils.validateEntity(hkTradecal);
        hkTradecalService.updateById(hkTradecal);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hktradecal:delete")
    public R delete(@RequestBody String[] ids){
        hkTradecalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
