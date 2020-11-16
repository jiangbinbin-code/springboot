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

import io.renren.modules.sys.entity.ShiborQuoteEntity;
import io.renren.modules.sys.service.ShiborQuoteService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:10
 */
@RestController
@RequestMapping("sys/shiborquote")
public class ShiborQuoteController {
    @Autowired
    private ShiborQuoteService shiborQuoteService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:shiborquote:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shiborQuoteService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:shiborquote:info")
    public R info(@PathVariable("id") String id){
        ShiborQuoteEntity shiborQuote = shiborQuoteService.getById(id);

        return R.ok().put("shiborQuote", shiborQuote);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:shiborquote:save")
    public R save(@RequestBody ShiborQuoteEntity shiborQuote){
        shiborQuoteService.save(shiborQuote);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:shiborquote:update")
    public R update(@RequestBody ShiborQuoteEntity shiborQuote){
        ValidatorUtils.validateEntity(shiborQuote);
        shiborQuoteService.updateById(shiborQuote);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:shiborquote:delete")
    public R delete(@RequestBody String[] ids){
        shiborQuoteService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
