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

import io.renren.modules.sys.entity.DisclosureDateEntity;
import io.renren.modules.sys.service.DisclosureDateService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/disclosuredate")
public class DisclosureDateController {
    @Autowired
    private DisclosureDateService disclosureDateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:disclosuredate:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = disclosureDateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:disclosuredate:info")
    public R info(@PathVariable("id") String id){
        DisclosureDateEntity disclosureDate = disclosureDateService.getById(id);

        return R.ok().put("disclosureDate", disclosureDate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:disclosuredate:save")
    public R save(@RequestBody DisclosureDateEntity disclosureDate){
        disclosureDateService.save(disclosureDate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:disclosuredate:update")
    public R update(@RequestBody DisclosureDateEntity disclosureDate){
        ValidatorUtils.validateEntity(disclosureDate);
        disclosureDateService.updateById(disclosureDate);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:disclosuredate:delete")
    public R delete(@RequestBody String[] ids){
        disclosureDateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
