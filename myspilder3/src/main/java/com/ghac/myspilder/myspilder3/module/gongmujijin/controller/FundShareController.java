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

import io.renren.modules.sys.entity.FundShareEntity;
import io.renren.modules.sys.service.FundShareService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/fundshare")
public class FundShareController {
    @Autowired
    private FundShareService fundShareService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundshare:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundShareService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundshare:info")
    public R info(@PathVariable("id") String id){
        FundShareEntity fundShare = fundShareService.getById(id);

        return R.ok().put("fundShare", fundShare);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundshare:save")
    public R save(@RequestBody FundShareEntity fundShare){
        fundShareService.save(fundShare);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundshare:update")
    public R update(@RequestBody FundShareEntity fundShare){
        ValidatorUtils.validateEntity(fundShare);
        fundShareService.updateById(fundShare);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundshare:delete")
    public R delete(@RequestBody String[] ids){
        fundShareService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
