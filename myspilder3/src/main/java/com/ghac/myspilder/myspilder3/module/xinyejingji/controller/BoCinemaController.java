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

import io.renren.modules.sys.entity.BoCinemaEntity;
import io.renren.modules.sys.service.BoCinemaService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/bocinema")
public class BoCinemaController {
    @Autowired
    private BoCinemaService boCinemaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:bocinema:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = boCinemaService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:bocinema:info")
    public R info(@PathVariable("id") String id){
        BoCinemaEntity boCinema = boCinemaService.getById(id);

        return R.ok().put("boCinema", boCinema);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:bocinema:save")
    public R save(@RequestBody BoCinemaEntity boCinema){
        boCinemaService.save(boCinema);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:bocinema:update")
    public R update(@RequestBody BoCinemaEntity boCinema){
        ValidatorUtils.validateEntity(boCinema);
        boCinemaService.updateById(boCinema);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:bocinema:delete")
    public R delete(@RequestBody String[] ids){
        boCinemaService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
