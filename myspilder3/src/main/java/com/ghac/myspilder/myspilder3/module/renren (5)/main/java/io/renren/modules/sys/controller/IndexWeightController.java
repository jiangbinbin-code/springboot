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

import io.renren.modules.sys.entity.IndexWeightEntity;
import io.renren.modules.sys.service.IndexWeightService;
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
@RequestMapping("sys/indexweight")
public class IndexWeightController {
    @Autowired
    private IndexWeightService indexWeightService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexweight:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexWeightService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexweight:info")
    public R info(@PathVariable("id") String id){
        IndexWeightEntity indexWeight = indexWeightService.getById(id);

        return R.ok().put("indexWeight", indexWeight);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexweight:save")
    public R save(@RequestBody IndexWeightEntity indexWeight){
        indexWeightService.save(indexWeight);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexweight:update")
    public R update(@RequestBody IndexWeightEntity indexWeight){
        ValidatorUtils.validateEntity(indexWeight);
        indexWeightService.updateById(indexWeight);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexweight:delete")
    public R delete(@RequestBody String[] ids){
        indexWeightService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
