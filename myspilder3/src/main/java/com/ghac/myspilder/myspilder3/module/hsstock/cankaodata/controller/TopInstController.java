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

import io.renren.modules.sys.entity.TopInstEntity;
import io.renren.modules.sys.service.TopInstService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/topinst")
public class TopInstController {
    @Autowired
    private TopInstService topInstService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:topinst:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = topInstService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:topinst:info")
    public R info(@PathVariable("id") String id){
        TopInstEntity topInst = topInstService.getById(id);

        return R.ok().put("topInst", topInst);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:topinst:save")
    public R save(@RequestBody TopInstEntity topInst){
        topInstService.save(topInst);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:topinst:update")
    public R update(@RequestBody TopInstEntity topInst){
        ValidatorUtils.validateEntity(topInst);
        topInstService.updateById(topInst);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:topinst:delete")
    public R delete(@RequestBody String[] ids){
        topInstService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
