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

import io.renren.modules.sys.entity.MajorNewsEntity;
import io.renren.modules.sys.service.MajorNewsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/majornews")
public class MajorNewsController {
    @Autowired
    private MajorNewsService majorNewsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:majornews:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = majorNewsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:majornews:info")
    public R info(@PathVariable("id") String id){
        MajorNewsEntity majorNews = majorNewsService.getById(id);

        return R.ok().put("majorNews", majorNews);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:majornews:save")
    public R save(@RequestBody MajorNewsEntity majorNews){
        majorNewsService.save(majorNews);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:majornews:update")
    public R update(@RequestBody MajorNewsEntity majorNews){
        ValidatorUtils.validateEntity(majorNews);
        majorNewsService.updateById(majorNews);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:majornews:delete")
    public R delete(@RequestBody String[] ids){
        majorNewsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
