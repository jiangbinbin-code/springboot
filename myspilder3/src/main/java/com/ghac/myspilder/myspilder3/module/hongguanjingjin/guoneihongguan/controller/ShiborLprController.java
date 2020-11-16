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

import io.renren.modules.sys.entity.ShiborLprEntity;
import io.renren.modules.sys.service.ShiborLprService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:15
 */
@RestController
@RequestMapping("sys/shiborlpr")
public class ShiborLprController {
    @Autowired
    private ShiborLprService shiborLprService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:shiborlpr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shiborLprService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:shiborlpr:info")
    public R info(@PathVariable("id") String id){
        ShiborLprEntity shiborLpr = shiborLprService.getById(id);

        return R.ok().put("shiborLpr", shiborLpr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:shiborlpr:save")
    public R save(@RequestBody ShiborLprEntity shiborLpr){
        shiborLprService.save(shiborLpr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:shiborlpr:update")
    public R update(@RequestBody ShiborLprEntity shiborLpr){
        ValidatorUtils.validateEntity(shiborLpr);
        shiborLprService.updateById(shiborLpr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:shiborlpr:delete")
    public R delete(@RequestBody String[] ids){
        shiborLprService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
