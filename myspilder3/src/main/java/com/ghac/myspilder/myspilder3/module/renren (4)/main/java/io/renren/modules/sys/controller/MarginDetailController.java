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

import io.renren.modules.sys.entity.MarginDetailEntity;
import io.renren.modules.sys.service.MarginDetailService;
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
@RequestMapping("sys/margindetail")
public class MarginDetailController {
    @Autowired
    private MarginDetailService marginDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:margindetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = marginDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:margindetail:info")
    public R info(@PathVariable("id") String id){
        MarginDetailEntity marginDetail = marginDetailService.getById(id);

        return R.ok().put("marginDetail", marginDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:margindetail:save")
    public R save(@RequestBody MarginDetailEntity marginDetail){
        marginDetailService.save(marginDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:margindetail:update")
    public R update(@RequestBody MarginDetailEntity marginDetail){
        ValidatorUtils.validateEntity(marginDetail);
        marginDetailService.updateById(marginDetail);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:margindetail:delete")
    public R delete(@RequestBody String[] ids){
        marginDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
