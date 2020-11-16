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

import io.renren.modules.sys.entity.NamechangeEntity;
import io.renren.modules.sys.service.NamechangeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/namechange")
public class NamechangeController {
    @Autowired
    private NamechangeService namechangeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:namechange:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = namechangeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:namechange:info")
    public R info(@PathVariable("id") String id){
        NamechangeEntity namechange = namechangeService.getById(id);

        return R.ok().put("namechange", namechange);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:namechange:save")
    public R save(@RequestBody NamechangeEntity namechange){
        namechangeService.save(namechange);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:namechange:update")
    public R update(@RequestBody NamechangeEntity namechange){
        ValidatorUtils.validateEntity(namechange);
        namechangeService.updateById(namechange);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:namechange:delete")
    public R delete(@RequestBody String[] ids){
        namechangeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
