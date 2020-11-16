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

import io.renren.modules.sys.entity.FundDivEntity;
import io.renren.modules.sys.service.FundDivService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/funddiv")
public class FundDivController {
    @Autowired
    private FundDivService fundDivService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:funddiv:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundDivService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:funddiv:info")
    public R info(@PathVariable("id") String id){
        FundDivEntity fundDiv = fundDivService.getById(id);

        return R.ok().put("fundDiv", fundDiv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:funddiv:save")
    public R save(@RequestBody FundDivEntity fundDiv){
        fundDivService.save(fundDiv);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:funddiv:update")
    public R update(@RequestBody FundDivEntity fundDiv){
        ValidatorUtils.validateEntity(fundDiv);
        fundDivService.updateById(fundDiv);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:funddiv:delete")
    public R delete(@RequestBody String[] ids){
        fundDivService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
