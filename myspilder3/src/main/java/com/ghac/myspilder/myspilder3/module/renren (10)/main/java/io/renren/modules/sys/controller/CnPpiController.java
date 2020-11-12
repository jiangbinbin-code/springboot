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

import io.renren.modules.sys.entity.CnPpiEntity;
import io.renren.modules.sys.service.CnPpiService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:55
 */
@RestController
@RequestMapping("sys/cnppi")
public class CnPpiController {
    @Autowired
    private CnPpiService cnPpiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cnppi:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cnPpiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cnppi:info")
    public R info(@PathVariable("id") String id){
        CnPpiEntity cnPpi = cnPpiService.getById(id);

        return R.ok().put("cnPpi", cnPpi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cnppi:save")
    public R save(@RequestBody CnPpiEntity cnPpi){
        cnPpiService.save(cnPpi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cnppi:update")
    public R update(@RequestBody CnPpiEntity cnPpi){
        ValidatorUtils.validateEntity(cnPpi);
        cnPpiService.updateById(cnPpi);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cnppi:delete")
    public R delete(@RequestBody String[] ids){
        cnPpiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
