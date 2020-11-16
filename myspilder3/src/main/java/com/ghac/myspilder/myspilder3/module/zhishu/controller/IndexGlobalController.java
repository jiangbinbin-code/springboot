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

import io.renren.modules.sys.entity.IndexGlobalEntity;
import io.renren.modules.sys.service.IndexGlobalService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:27
 */
@RestController
@RequestMapping("sys/indexglobal")
public class IndexGlobalController {
    @Autowired
    private IndexGlobalService indexGlobalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexglobal:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexGlobalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexglobal:info")
    public R info(@PathVariable("id") String id){
        IndexGlobalEntity indexGlobal = indexGlobalService.getById(id);

        return R.ok().put("indexGlobal", indexGlobal);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexglobal:save")
    public R save(@RequestBody IndexGlobalEntity indexGlobal){
        indexGlobalService.save(indexGlobal);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexglobal:update")
    public R update(@RequestBody IndexGlobalEntity indexGlobal){
        ValidatorUtils.validateEntity(indexGlobal);
        indexGlobalService.updateById(indexGlobal);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexglobal:delete")
    public R delete(@RequestBody String[] ids){
        indexGlobalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
