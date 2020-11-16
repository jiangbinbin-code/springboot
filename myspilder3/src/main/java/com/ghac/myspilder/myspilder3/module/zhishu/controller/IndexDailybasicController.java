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

import io.renren.modules.sys.entity.IndexDailybasicEntity;
import io.renren.modules.sys.service.IndexDailybasicService;
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
@RequestMapping("sys/indexdailybasic")
public class IndexDailybasicController {
    @Autowired
    private IndexDailybasicService indexDailybasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexdailybasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexDailybasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexdailybasic:info")
    public R info(@PathVariable("id") String id){
        IndexDailybasicEntity indexDailybasic = indexDailybasicService.getById(id);

        return R.ok().put("indexDailybasic", indexDailybasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexdailybasic:save")
    public R save(@RequestBody IndexDailybasicEntity indexDailybasic){
        indexDailybasicService.save(indexDailybasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexdailybasic:update")
    public R update(@RequestBody IndexDailybasicEntity indexDailybasic){
        ValidatorUtils.validateEntity(indexDailybasic);
        indexDailybasicService.updateById(indexDailybasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexdailybasic:delete")
    public R delete(@RequestBody String[] ids){
        indexDailybasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
