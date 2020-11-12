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

import io.renren.modules.sys.entity.NewShareEntity;
import io.renren.modules.sys.service.NewShareService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@RestController
@RequestMapping("sys/newshare")
public class NewShareController {
    @Autowired
    private NewShareService newShareService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:newshare:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = newShareService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:newshare:info")
    public R info(@PathVariable("id") String id){
        NewShareEntity newShare = newShareService.getById(id);

        return R.ok().put("newShare", newShare);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:newshare:save")
    public R save(@RequestBody NewShareEntity newShare){
        newShareService.save(newShare);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:newshare:update")
    public R update(@RequestBody NewShareEntity newShare){
        ValidatorUtils.validateEntity(newShare);
        newShareService.updateById(newShare);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:newshare:delete")
    public R delete(@RequestBody String[] ids){
        newShareService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
