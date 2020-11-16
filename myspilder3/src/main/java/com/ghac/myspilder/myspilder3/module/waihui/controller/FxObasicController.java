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

import io.renren.modules.sys.entity.FxObasicEntity;
import io.renren.modules.sys.service.FxObasicService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/fxobasic")
public class FxObasicController {
    @Autowired
    private FxObasicService fxObasicService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fxobasic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fxObasicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fxobasic:info")
    public R info(@PathVariable("id") String id){
        FxObasicEntity fxObasic = fxObasicService.getById(id);

        return R.ok().put("fxObasic", fxObasic);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fxobasic:save")
    public R save(@RequestBody FxObasicEntity fxObasic){
        fxObasicService.save(fxObasic);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fxobasic:update")
    public R update(@RequestBody FxObasicEntity fxObasic){
        ValidatorUtils.validateEntity(fxObasic);
        fxObasicService.updateById(fxObasic);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fxobasic:delete")
    public R delete(@RequestBody String[] ids){
        fxObasicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
