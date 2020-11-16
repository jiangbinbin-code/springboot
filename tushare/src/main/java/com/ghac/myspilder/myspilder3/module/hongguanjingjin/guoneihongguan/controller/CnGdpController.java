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

import io.renren.modules.sys.entity.CnGdpEntity;
import io.renren.modules.sys.service.CnGdpService;
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
@RequestMapping("sys/cngdp")
public class CnGdpController {
    @Autowired
    private CnGdpService cnGdpService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cngdp:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cnGdpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cngdp:info")
    public R info(@PathVariable("id") String id){
        CnGdpEntity cnGdp = cnGdpService.getById(id);

        return R.ok().put("cnGdp", cnGdp);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cngdp:save")
    public R save(@RequestBody CnGdpEntity cnGdp){
        cnGdpService.save(cnGdp);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cngdp:update")
    public R update(@RequestBody CnGdpEntity cnGdp){
        ValidatorUtils.validateEntity(cnGdp);
        cnGdpService.updateById(cnGdp);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cngdp:delete")
    public R delete(@RequestBody String[] ids){
        cnGdpService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
