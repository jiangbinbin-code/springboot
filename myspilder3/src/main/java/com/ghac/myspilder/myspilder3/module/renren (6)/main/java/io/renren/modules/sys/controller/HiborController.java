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

import io.renren.modules.sys.entity.HiborEntity;
import io.renren.modules.sys.service.HiborService;
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
@RequestMapping("sys/hibor")
public class HiborController {
    @Autowired
    private HiborService hiborService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:hibor:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hiborService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:hibor:info")
    public R info(@PathVariable("id") String id){
        HiborEntity hibor = hiborService.getById(id);

        return R.ok().put("hibor", hibor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:hibor:save")
    public R save(@RequestBody HiborEntity hibor){
        hiborService.save(hibor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:hibor:update")
    public R update(@RequestBody HiborEntity hibor){
        ValidatorUtils.validateEntity(hibor);
        hiborService.updateById(hibor);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:hibor:delete")
    public R delete(@RequestBody String[] ids){
        hiborService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
