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

import io.renren.modules.sys.entity.UsTycrEntity;
import io.renren.modules.sys.service.UsTycrService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/ustycr")
public class UsTycrController {
    @Autowired
    private UsTycrService usTycrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustycr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTycrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustycr:info")
    public R info(@PathVariable("id") String id){
        UsTycrEntity usTycr = usTycrService.getById(id);

        return R.ok().put("usTycr", usTycr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustycr:save")
    public R save(@RequestBody UsTycrEntity usTycr){
        usTycrService.save(usTycr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustycr:update")
    public R update(@RequestBody UsTycrEntity usTycr){
        ValidatorUtils.validateEntity(usTycr);
        usTycrService.updateById(usTycr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustycr:delete")
    public R delete(@RequestBody String[] ids){
        usTycrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
