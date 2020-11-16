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

import io.renren.modules.sys.entity.UsTbrEntity;
import io.renren.modules.sys.service.UsTbrService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/ustbr")
public class UsTbrController {
    @Autowired
    private UsTbrService usTbrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:ustbr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = usTbrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:ustbr:info")
    public R info(@PathVariable("id") String id){
        UsTbrEntity usTbr = usTbrService.getById(id);

        return R.ok().put("usTbr", usTbr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:ustbr:save")
    public R save(@RequestBody UsTbrEntity usTbr){
        usTbrService.save(usTbr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:ustbr:update")
    public R update(@RequestBody UsTbrEntity usTbr){
        ValidatorUtils.validateEntity(usTbr);
        usTbrService.updateById(usTbr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:ustbr:delete")
    public R delete(@RequestBody String[] ids){
        usTbrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
