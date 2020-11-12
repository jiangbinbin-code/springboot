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

import io.renren.modules.sys.entity.FundAdjEntity;
import io.renren.modules.sys.service.FundAdjService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:47
 */
@RestController
@RequestMapping("sys/fundadj")
public class FundAdjController {
    @Autowired
    private FundAdjService fundAdjService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fundadj:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fundAdjService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fundadj:info")
    public R info(@PathVariable("id") String id){
        FundAdjEntity fundAdj = fundAdjService.getById(id);

        return R.ok().put("fundAdj", fundAdj);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fundadj:save")
    public R save(@RequestBody FundAdjEntity fundAdj){
        fundAdjService.save(fundAdj);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fundadj:update")
    public R update(@RequestBody FundAdjEntity fundAdj){
        ValidatorUtils.validateEntity(fundAdj);
        fundAdjService.updateById(fundAdj);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fundadj:delete")
    public R delete(@RequestBody String[] ids){
        fundAdjService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
