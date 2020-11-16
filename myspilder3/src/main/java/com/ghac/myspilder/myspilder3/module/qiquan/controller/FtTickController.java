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

import io.renren.modules.sys.entity.FtTickEntity;
import io.renren.modules.sys.service.FtTickService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:47
 */
@RestController
@RequestMapping("sys/fttick")
public class FtTickController {
    @Autowired
    private FtTickService ftTickService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fttick:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ftTickService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fttick:info")
    public R info(@PathVariable("id") String id){
        FtTickEntity ftTick = ftTickService.getById(id);

        return R.ok().put("ftTick", ftTick);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fttick:save")
    public R save(@RequestBody FtTickEntity ftTick){
        ftTickService.save(ftTick);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fttick:update")
    public R update(@RequestBody FtTickEntity ftTick){
        ValidatorUtils.validateEntity(ftTick);
        ftTickService.updateById(ftTick);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fttick:delete")
    public R delete(@RequestBody String[] ids){
        ftTickService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
