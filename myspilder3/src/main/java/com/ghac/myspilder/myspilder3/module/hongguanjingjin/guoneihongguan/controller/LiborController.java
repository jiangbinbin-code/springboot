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

import io.renren.modules.sys.entity.LiborEntity;
import io.renren.modules.sys.service.LiborService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:26
 */
@RestController
@RequestMapping("sys/libor")
public class LiborController {
    @Autowired
    private LiborService liborService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:libor:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = liborService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:libor:info")
    public R info(@PathVariable("id") String id){
        LiborEntity libor = liborService.getById(id);

        return R.ok().put("libor", libor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:libor:save")
    public R save(@RequestBody LiborEntity libor){
        liborService.save(libor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:libor:update")
    public R update(@RequestBody LiborEntity libor){
        ValidatorUtils.validateEntity(libor);
        liborService.updateById(libor);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:libor:delete")
    public R delete(@RequestBody String[] ids){
        liborService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
