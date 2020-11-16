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

import io.renren.modules.sys.entity.ConceptDetailEntity;
import io.renren.modules.sys.service.ConceptDetailService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:54
 */
@RestController
@RequestMapping("sys/conceptdetail")
public class ConceptDetailController {
    @Autowired
    private ConceptDetailService conceptDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:conceptdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = conceptDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{mid}")
    @RequiresPermissions("sys:conceptdetail:info")
    public R info(@PathVariable("mid") String mid){
        ConceptDetailEntity conceptDetail = conceptDetailService.getById(mid);

        return R.ok().put("conceptDetail", conceptDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:conceptdetail:save")
    public R save(@RequestBody ConceptDetailEntity conceptDetail){
        conceptDetailService.save(conceptDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:conceptdetail:update")
    public R update(@RequestBody ConceptDetailEntity conceptDetail){
        ValidatorUtils.validateEntity(conceptDetail);
        conceptDetailService.updateById(conceptDetail);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:conceptdetail:delete")
    public R delete(@RequestBody String[] mids){
        conceptDetailService.removeByIds(Arrays.asList(mids));

        return R.ok();
    }

}
