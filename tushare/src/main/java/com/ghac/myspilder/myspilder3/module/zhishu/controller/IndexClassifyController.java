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

import io.renren.modules.sys.entity.IndexClassifyEntity;
import io.renren.modules.sys.service.IndexClassifyService;
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
@RequestMapping("sys/indexclassify")
public class IndexClassifyController {
    @Autowired
    private IndexClassifyService indexClassifyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexclassify:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexClassifyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexclassify:info")
    public R info(@PathVariable("id") String id){
        IndexClassifyEntity indexClassify = indexClassifyService.getById(id);

        return R.ok().put("indexClassify", indexClassify);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexclassify:save")
    public R save(@RequestBody IndexClassifyEntity indexClassify){
        indexClassifyService.save(indexClassify);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexclassify:update")
    public R update(@RequestBody IndexClassifyEntity indexClassify){
        ValidatorUtils.validateEntity(indexClassify);
        indexClassifyService.updateById(indexClassify);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexclassify:delete")
    public R delete(@RequestBody String[] ids){
        indexClassifyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
