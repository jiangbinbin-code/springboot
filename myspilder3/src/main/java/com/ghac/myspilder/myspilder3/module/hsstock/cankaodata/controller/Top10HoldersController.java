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

import io.renren.modules.sys.entity.Top10HoldersEntity;
import io.renren.modules.sys.service.Top10HoldersService;
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
@RequestMapping("sys/top10holders")
public class Top10HoldersController {
    @Autowired
    private Top10HoldersService top10HoldersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:top10holders:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = top10HoldersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:top10holders:info")
    public R info(@PathVariable("id") String id){
        Top10HoldersEntity top10Holders = top10HoldersService.getById(id);

        return R.ok().put("top10Holders", top10Holders);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:top10holders:save")
    public R save(@RequestBody Top10HoldersEntity top10Holders){
        top10HoldersService.save(top10Holders);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:top10holders:update")
    public R update(@RequestBody Top10HoldersEntity top10Holders){
        ValidatorUtils.validateEntity(top10Holders);
        top10HoldersService.updateById(top10Holders);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:top10holders:delete")
    public R delete(@RequestBody String[] ids){
        top10HoldersService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
