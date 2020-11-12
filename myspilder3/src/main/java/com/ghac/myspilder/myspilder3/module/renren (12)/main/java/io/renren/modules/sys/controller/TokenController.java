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

import io.renren.modules.sys.entity.TokenEntity;
import io.renren.modules.sys.service.TokenService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 用户Token
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
@RestController
@RequestMapping("sys/token")
public class TokenController {
    @Autowired
    private TokenService tokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:token:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("sys:token:info")
    public R info(@PathVariable("userId") Long userId){
        TokenEntity token = tokenService.getById(userId);

        return R.ok().put("token", token);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:token:save")
    public R save(@RequestBody TokenEntity token){
        tokenService.save(token);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:token:update")
    public R update(@RequestBody TokenEntity token){
        ValidatorUtils.validateEntity(token);
        tokenService.updateById(token);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:token:delete")
    public R delete(@RequestBody Long[] userIds){
        tokenService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
