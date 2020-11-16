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

import io.renren.modules.sys.entity.CbIssueEntity;
import io.renren.modules.sys.service.CbIssueService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/cbissue")
public class CbIssueController {
    @Autowired
    private CbIssueService cbIssueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cbissue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cbIssueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cbissue:info")
    public R info(@PathVariable("id") String id){
        CbIssueEntity cbIssue = cbIssueService.getById(id);

        return R.ok().put("cbIssue", cbIssue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cbissue:save")
    public R save(@RequestBody CbIssueEntity cbIssue){
        cbIssueService.save(cbIssue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cbissue:update")
    public R update(@RequestBody CbIssueEntity cbIssue){
        ValidatorUtils.validateEntity(cbIssue);
        cbIssueService.updateById(cbIssue);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cbissue:delete")
    public R delete(@RequestBody String[] ids){
        cbIssueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
