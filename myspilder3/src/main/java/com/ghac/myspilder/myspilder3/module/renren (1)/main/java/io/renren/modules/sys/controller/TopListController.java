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

import io.renren.modules.sys.entity.TopListEntity;
import io.renren.modules.sys.service.TopListService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/toplist")
public class TopListController {
    @Autowired
    private TopListService topListService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:toplist:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = topListService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:toplist:info")
    public R info(@PathVariable("id") String id){
        TopListEntity topList = topListService.getById(id);

        return R.ok().put("topList", topList);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:toplist:save")
    public R save(@RequestBody TopListEntity topList){
        topListService.save(topList);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:toplist:update")
    public R update(@RequestBody TopListEntity topList){
        ValidatorUtils.validateEntity(topList);
        topListService.updateById(topList);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:toplist:delete")
    public R delete(@RequestBody String[] ids){
        topListService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
