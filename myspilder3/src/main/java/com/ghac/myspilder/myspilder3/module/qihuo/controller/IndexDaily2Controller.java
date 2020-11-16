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

import io.renren.modules.sys.entity.IndexDaily2Entity;
import io.renren.modules.sys.service.IndexDaily2Service;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@RestController
@RequestMapping("sys/indexdaily2")
public class IndexDaily2Controller {
    @Autowired
    private IndexDaily2Service indexDaily2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexdaily2:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexDaily2Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexdaily2:info")
    public R info(@PathVariable("id") String id){
        IndexDaily2Entity indexDaily2 = indexDaily2Service.getById(id);

        return R.ok().put("indexDaily2", indexDaily2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexdaily2:save")
    public R save(@RequestBody IndexDaily2Entity indexDaily2){
        indexDaily2Service.save(indexDaily2);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexdaily2:update")
    public R update(@RequestBody IndexDaily2Entity indexDaily2){
        ValidatorUtils.validateEntity(indexDaily2);
        indexDaily2Service.updateById(indexDaily2);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexdaily2:delete")
    public R delete(@RequestBody String[] ids){
        indexDaily2Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
