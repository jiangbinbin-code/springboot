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

import io.renren.modules.sys.entity.CnCpiEntity;
import io.renren.modules.sys.service.CnCpiService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cncpi")
public class CnCpiController {
    @Autowired
    private CnCpiService cnCpiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cncpi:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cnCpiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cncpi:info")
    public R info(@PathVariable("id") String id){
        CnCpiEntity cnCpi = cnCpiService.getById(id);

        return R.ok().put("cnCpi", cnCpi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cncpi:save")
    public R save(@RequestBody CnCpiEntity cnCpi){
        cnCpiService.save(cnCpi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cncpi:update")
    public R update(@RequestBody CnCpiEntity cnCpi){
        ValidatorUtils.validateEntity(cnCpi);
        cnCpiService.updateById(cnCpi);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cncpi:delete")
    public R delete(@RequestBody String[] ids){
        cnCpiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
