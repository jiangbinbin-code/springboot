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

import io.renren.modules.sys.entity.PledgeDetailEntity;
import io.renren.modules.sys.service.PledgeDetailService;
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
@RequestMapping("sys/pledgedetail")
public class PledgeDetailController {
    @Autowired
    private PledgeDetailService pledgeDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:pledgedetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pledgeDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:pledgedetail:info")
    public R info(@PathVariable("id") String id){
        PledgeDetailEntity pledgeDetail = pledgeDetailService.getById(id);

        return R.ok().put("pledgeDetail", pledgeDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:pledgedetail:save")
    public R save(@RequestBody PledgeDetailEntity pledgeDetail){
        pledgeDetailService.save(pledgeDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:pledgedetail:update")
    public R update(@RequestBody PledgeDetailEntity pledgeDetail){
        ValidatorUtils.validateEntity(pledgeDetail);
        pledgeDetailService.updateById(pledgeDetail);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:pledgedetail:delete")
    public R delete(@RequestBody String[] ids){
        pledgeDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
