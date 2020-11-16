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

import io.renren.modules.sys.entity.HsConstEntity;
import io.renren.modules.sys.service.HsConstService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@RestController
@RequestMapping("sys/hsconst")
public class HsConstController {
    @Autowired
    private HsConstService hsConstService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hsconst:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hsConstService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hsconst:info")
    public R info(@PathVariable("id") String id){
        HsConstEntity hsConst = hsConstService.getById(id);

        return R.ok().put("hsConst", hsConst);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hsconst:save")
    public R save(@RequestBody HsConstEntity hsConst){
        hsConstService.save(hsConst);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hsconst:update")
    public R update(@RequestBody HsConstEntity hsConst){
        ValidatorUtils.validateEntity(hsConst);
        hsConstService.updateById(hsConst);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hsconst:delete")
    public R delete(@RequestBody String[] ids){
        hsConstService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
