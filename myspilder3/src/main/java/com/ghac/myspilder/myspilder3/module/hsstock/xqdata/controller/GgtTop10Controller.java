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

import io.renren.modules.sys.entity.GgtTop10Entity;
import io.renren.modules.sys.service.GgtTop10Service;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:38
 */
@RestController
@RequestMapping("sys/ggttop10")
public class GgtTop10Controller {
    @Autowired
    private GgtTop10Service ggtTop10Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ggttop10:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ggtTop10Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ggttop10:info")
    public R info(@PathVariable("id") String id){
        GgtTop10Entity ggtTop10 = ggtTop10Service.getById(id);

        return R.ok().put("ggtTop10", ggtTop10);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ggttop10:save")
    public R save(@RequestBody GgtTop10Entity ggtTop10){
        ggtTop10Service.save(ggtTop10);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ggttop10:update")
    public R update(@RequestBody GgtTop10Entity ggtTop10){
        ValidatorUtils.validateEntity(ggtTop10);
        ggtTop10Service.updateById(ggtTop10);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ggttop10:delete")
    public R delete(@RequestBody String[] ids){
        ggtTop10Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
