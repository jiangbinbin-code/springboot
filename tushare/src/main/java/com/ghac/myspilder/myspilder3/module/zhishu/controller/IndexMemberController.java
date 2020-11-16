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

import io.renren.modules.sys.entity.IndexMemberEntity;
import io.renren.modules.sys.service.IndexMemberService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:27
 */
@RestController
@RequestMapping("sys/indexmember")
public class IndexMemberController {
    @Autowired
    private IndexMemberService indexMemberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:indexmember:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = indexMemberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:indexmember:info")
    public R info(@PathVariable("id") String id){
        IndexMemberEntity indexMember = indexMemberService.getById(id);

        return R.ok().put("indexMember", indexMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:indexmember:save")
    public R save(@RequestBody IndexMemberEntity indexMember){
        indexMemberService.save(indexMember);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:indexmember:update")
    public R update(@RequestBody IndexMemberEntity indexMember){
        ValidatorUtils.validateEntity(indexMember);
        indexMemberService.updateById(indexMember);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:indexmember:delete")
    public R delete(@RequestBody String[] ids){
        indexMemberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
