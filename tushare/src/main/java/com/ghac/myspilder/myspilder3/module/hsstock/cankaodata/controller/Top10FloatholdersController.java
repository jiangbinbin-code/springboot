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

import io.renren.modules.sys.entity.Top10FloatholdersEntity;
import io.renren.modules.sys.service.Top10FloatholdersService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/top10floatholders")
public class Top10FloatholdersController {
    @Autowired
    private Top10FloatholdersService top10FloatholdersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:top10floatholders:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = top10FloatholdersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:top10floatholders:info")
    public R info(@PathVariable("id") String id){
        Top10FloatholdersEntity top10Floatholders = top10FloatholdersService.getById(id);

        return R.ok().put("top10Floatholders", top10Floatholders);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:top10floatholders:save")
    public R save(@RequestBody Top10FloatholdersEntity top10Floatholders){
        top10FloatholdersService.save(top10Floatholders);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:top10floatholders:update")
    public R update(@RequestBody Top10FloatholdersEntity top10Floatholders){
        ValidatorUtils.validateEntity(top10Floatholders);
        top10FloatholdersService.updateById(top10Floatholders);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:top10floatholders:delete")
    public R delete(@RequestBody String[] ids){
        top10FloatholdersService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
