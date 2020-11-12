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

import io.renren.modules.sys.entity.CctvNewsEntity;
import io.renren.modules.sys.service.CctvNewsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cctvnews")
public class CctvNewsController {
    @Autowired
    private CctvNewsService cctvNewsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cctvnews:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cctvNewsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cctvnews:info")
    public R info(@PathVariable("id") String id){
        CctvNewsEntity cctvNews = cctvNewsService.getById(id);

        return R.ok().put("cctvNews", cctvNews);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cctvnews:save")
    public R save(@RequestBody CctvNewsEntity cctvNews){
        cctvNewsService.save(cctvNews);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cctvnews:update")
    public R update(@RequestBody CctvNewsEntity cctvNews){
        ValidatorUtils.validateEntity(cctvNews);
        cctvNewsService.updateById(cctvNews);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cctvnews:delete")
    public R delete(@RequestBody String[] ids){
        cctvNewsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
