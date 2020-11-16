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

import io.renren.modules.sys.entity.IndexBasicEntity;
import io.renren.modules.sys.service.IndexBasicService;
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
@RequestMapping("sys/indexbasic")
public class IndexBasicController {
    @Autowired
    private IndexBasicService indexBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexbasic:info")
    public R info(@PathVariable("id") String id){
        IndexBasicEntity indexBasic = indexBasicService.getById(id);

        return R.ok().put("indexBasic", indexBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexbasic:save")
    public R save(@RequestBody IndexBasicEntity indexBasic){
        indexBasicService.save(indexBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexbasic:update")
    public R update(@RequestBody IndexBasicEntity indexBasic){
        ValidatorUtils.validateEntity(indexBasic);
        indexBasicService.updateById(indexBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexbasic:delete")
    public R delete(@RequestBody String[] ids){
        indexBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
