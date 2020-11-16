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

import io.renren.modules.sys.entity.BlockTradeEntity;
import io.renren.modules.sys.service.BlockTradeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/blocktrade")
public class BlockTradeController {
    @Autowired
    private BlockTradeService blockTradeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:blocktrade:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = blockTradeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:blocktrade:info")
    public R info(@PathVariable("id") String id){
        BlockTradeEntity blockTrade = blockTradeService.getById(id);

        return R.ok().put("blockTrade", blockTrade);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:blocktrade:save")
    public R save(@RequestBody BlockTradeEntity blockTrade){
        blockTradeService.save(blockTrade);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:blocktrade:update")
    public R update(@RequestBody BlockTradeEntity blockTrade){
        ValidatorUtils.validateEntity(blockTrade);
        blockTradeService.updateById(blockTrade);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:blocktrade:delete")
    public R delete(@RequestBody String[] ids){
        blockTradeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
