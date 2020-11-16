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

import io.renren.modules.sys.entity.FutSettleEntity;
import io.renren.modules.sys.service.FutSettleService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/futsettle")
public class FutSettleController {
    @Autowired
    private FutSettleService futSettleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futsettle:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futSettleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futsettle:info")
    public R info(@PathVariable("id") String id){
        FutSettleEntity futSettle = futSettleService.getById(id);

        return R.ok().put("futSettle", futSettle);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futsettle:save")
    public R save(@RequestBody FutSettleEntity futSettle){
        futSettleService.save(futSettle);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futsettle:update")
    public R update(@RequestBody FutSettleEntity futSettle){
        ValidatorUtils.validateEntity(futSettle);
        futSettleService.updateById(futSettle);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futsettle:delete")
    public R delete(@RequestBody String[] ids){
        futSettleService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
