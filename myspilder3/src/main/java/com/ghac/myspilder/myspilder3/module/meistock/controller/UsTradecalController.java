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

import io.renren.modules.sys.entity.UsTradecalEntity;
import io.renren.modules.sys.service.UsTradecalService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/ustradecal")
public class UsTradecalController {
    @Autowired
    private UsTradecalService usTradecalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustradecal:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTradecalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustradecal:info")
    public R info(@PathVariable("id") String id){
        UsTradecalEntity usTradecal = usTradecalService.getById(id);

        return R.ok().put("usTradecal", usTradecal);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustradecal:save")
    public R save(@RequestBody UsTradecalEntity usTradecal){
        usTradecalService.save(usTradecal);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustradecal:update")
    public R update(@RequestBody UsTradecalEntity usTradecal){
        ValidatorUtils.validateEntity(usTradecal);
        usTradecalService.updateById(usTradecal);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustradecal:delete")
    public R delete(@RequestBody String[] ids){
        usTradecalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
