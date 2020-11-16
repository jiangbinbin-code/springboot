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

import io.renren.modules.sys.entity.WzIndexEntity;
import io.renren.modules.sys.service.WzIndexService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/wzindex")
public class WzIndexController {
    @Autowired
    private WzIndexService wzIndexService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:wzindex:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wzIndexService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:wzindex:info")
    public R info(@PathVariable("id") String id){
        WzIndexEntity wzIndex = wzIndexService.getById(id);

        return R.ok().put("wzIndex", wzIndex);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:wzindex:save")
    public R save(@RequestBody WzIndexEntity wzIndex){
        wzIndexService.save(wzIndex);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:wzindex:update")
    public R update(@RequestBody WzIndexEntity wzIndex){
        ValidatorUtils.validateEntity(wzIndex);
        wzIndexService.updateById(wzIndex);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:wzindex:delete")
    public R delete(@RequestBody String[] ids){
        wzIndexService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
