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

import io.renren.modules.sys.entity.PledgeStatEntity;
import io.renren.modules.sys.service.PledgeStatService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:15
 */
@RestController
@RequestMapping("sys/pledgestat")
public class PledgeStatController {
    @Autowired
    private PledgeStatService pledgeStatService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:pledgestat:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pledgeStatService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:pledgestat:info")
    public R info(@PathVariable("id") String id){
        PledgeStatEntity pledgeStat = pledgeStatService.getById(id);

        return R.ok().put("pledgeStat", pledgeStat);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:pledgestat:save")
    public R save(@RequestBody PledgeStatEntity pledgeStat){
        pledgeStatService.save(pledgeStat);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:pledgestat:update")
    public R update(@RequestBody PledgeStatEntity pledgeStat){
        ValidatorUtils.validateEntity(pledgeStat);
        pledgeStatService.updateById(pledgeStat);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:pledgestat:delete")
    public R delete(@RequestBody String[] ids){
        pledgeStatService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
