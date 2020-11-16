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

import io.renren.modules.sys.entity.TeleplayRecordEntity;
import io.renren.modules.sys.service.TeleplayRecordService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/teleplayrecord")
public class TeleplayRecordController {
    @Autowired
    private TeleplayRecordService teleplayRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:teleplayrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = teleplayRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:teleplayrecord:info")
    public R info(@PathVariable("id") String id){
        TeleplayRecordEntity teleplayRecord = teleplayRecordService.getById(id);

        return R.ok().put("teleplayRecord", teleplayRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:teleplayrecord:save")
    public R save(@RequestBody TeleplayRecordEntity teleplayRecord){
        teleplayRecordService.save(teleplayRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:teleplayrecord:update")
    public R update(@RequestBody TeleplayRecordEntity teleplayRecord){
        ValidatorUtils.validateEntity(teleplayRecord);
        teleplayRecordService.updateById(teleplayRecord);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:teleplayrecord:delete")
    public R delete(@RequestBody String[] ids){
        teleplayRecordService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
