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

import io.renren.modules.sys.entity.IndexDailyEntity;
import io.renren.modules.sys.service.IndexDailyService;
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
@RequestMapping("sys/indexdaily")
public class IndexDailyController {
    @Autowired
    private IndexDailyService indexDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexdaily:info")
    public R info(@PathVariable("id") String id){
        IndexDailyEntity indexDaily = indexDailyService.getById(id);

        return R.ok().put("indexDaily", indexDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexdaily:save")
    public R save(@RequestBody IndexDailyEntity indexDaily){
        indexDailyService.save(indexDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexdaily:update")
    public R update(@RequestBody IndexDailyEntity indexDaily){
        ValidatorUtils.validateEntity(indexDaily);
        indexDailyService.updateById(indexDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexdaily:delete")
    public R delete(@RequestBody String[] ids){
        indexDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
