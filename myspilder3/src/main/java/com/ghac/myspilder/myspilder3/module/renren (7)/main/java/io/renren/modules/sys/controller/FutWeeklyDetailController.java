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

import io.renren.modules.sys.entity.FutWeeklyDetailEntity;
import io.renren.modules.sys.service.FutWeeklyDetailService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:38
 */
@RestController
@RequestMapping("sys/futweeklydetail")
public class FutWeeklyDetailController {
    @Autowired
    private FutWeeklyDetailService futWeeklyDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futweeklydetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futWeeklyDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futweeklydetail:info")
    public R info(@PathVariable("id") String id){
        FutWeeklyDetailEntity futWeeklyDetail = futWeeklyDetailService.getById(id);

        return R.ok().put("futWeeklyDetail", futWeeklyDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futweeklydetail:save")
    public R save(@RequestBody FutWeeklyDetailEntity futWeeklyDetail){
        futWeeklyDetailService.save(futWeeklyDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futweeklydetail:update")
    public R update(@RequestBody FutWeeklyDetailEntity futWeeklyDetail){
        ValidatorUtils.validateEntity(futWeeklyDetail);
        futWeeklyDetailService.updateById(futWeeklyDetail);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futweeklydetail:delete")
    public R delete(@RequestBody String[] ids){
        futWeeklyDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
