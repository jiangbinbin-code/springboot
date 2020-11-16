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

import io.renren.modules.sys.entity.CnMEntity;
import io.renren.modules.sys.service.CnMService;
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
@RequestMapping("sys/cnm")
public class CnMController {
    @Autowired
    private CnMService cnMService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cnm:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cnMService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cnm:info")
    public R info(@PathVariable("id") String id){
        CnMEntity cnM = cnMService.getById(id);

        return R.ok().put("cnM", cnM);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cnm:save")
    public R save(@RequestBody CnMEntity cnM){
        cnMService.save(cnM);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cnm:update")
    public R update(@RequestBody CnMEntity cnM){
        ValidatorUtils.validateEntity(cnM);
        cnMService.updateById(cnM);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cnm:delete")
    public R delete(@RequestBody String[] ids){
        cnMService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
