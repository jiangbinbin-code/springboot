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

import io.renren.modules.sys.entity.OptBasicEntity;
import io.renren.modules.sys.service.OptBasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:19
 */
@RestController
@RequestMapping("sys/optbasic")
public class OptBasicController {
    @Autowired
    private OptBasicService optBasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:optbasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = optBasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:optbasic:info")
    public R info(@PathVariable("id") String id){
        OptBasicEntity optBasic = optBasicService.getById(id);

        return R.ok().put("optBasic", optBasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:optbasic:save")
    public R save(@RequestBody OptBasicEntity optBasic){
        optBasicService.save(optBasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:optbasic:update")
    public R update(@RequestBody OptBasicEntity optBasic){
        ValidatorUtils.validateEntity(optBasic);
        optBasicService.updateById(optBasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:optbasic:delete")
    public R delete(@RequestBody String[] ids){
        optBasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
