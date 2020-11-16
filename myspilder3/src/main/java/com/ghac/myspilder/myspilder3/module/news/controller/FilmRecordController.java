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

import io.renren.modules.sys.entity.FilmRecordEntity;
import io.renren.modules.sys.service.FilmRecordService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/filmrecord")
public class FilmRecordController {
    @Autowired
    private FilmRecordService filmRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:filmrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = filmRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:filmrecord:info")
    public R info(@PathVariable("id") String id){
        FilmRecordEntity filmRecord = filmRecordService.getById(id);

        return R.ok().put("filmRecord", filmRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:filmrecord:save")
    public R save(@RequestBody FilmRecordEntity filmRecord){
        filmRecordService.save(filmRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:filmrecord:update")
    public R update(@RequestBody FilmRecordEntity filmRecord){
        ValidatorUtils.validateEntity(filmRecord);
        filmRecordService.updateById(filmRecord);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:filmrecord:delete")
    public R delete(@RequestBody String[] ids){
        filmRecordService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
