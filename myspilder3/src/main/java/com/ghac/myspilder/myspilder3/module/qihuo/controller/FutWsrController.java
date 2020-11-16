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

import io.renren.modules.sys.entity.FutWsrEntity;
import io.renren.modules.sys.service.FutWsrService;
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
@RequestMapping("sys/futwsr")
public class FutWsrController {
    @Autowired
    private FutWsrService futWsrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futwsr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futWsrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futwsr:info")
    public R info(@PathVariable("id") String id){
        FutWsrEntity futWsr = futWsrService.getById(id);

        return R.ok().put("futWsr", futWsr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futwsr:save")
    public R save(@RequestBody FutWsrEntity futWsr){
        futWsrService.save(futWsr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futwsr:update")
    public R update(@RequestBody FutWsrEntity futWsr){
        ValidatorUtils.validateEntity(futWsr);
        futWsrService.updateById(futWsr);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futwsr:delete")
    public R delete(@RequestBody String[] ids){
        futWsrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
