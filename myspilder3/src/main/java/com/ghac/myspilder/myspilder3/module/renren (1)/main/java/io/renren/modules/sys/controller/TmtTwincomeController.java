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

import io.renren.modules.sys.entity.TmtTwincomeEntity;
import io.renren.modules.sys.service.TmtTwincomeService;
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
@RequestMapping("sys/tmttwincome")
public class TmtTwincomeController {
    @Autowired
    private TmtTwincomeService tmtTwincomeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:tmttwincome:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmtTwincomeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:tmttwincome:info")
    public R info(@PathVariable("id") String id){
        TmtTwincomeEntity tmtTwincome = tmtTwincomeService.getById(id);

        return R.ok().put("tmtTwincome", tmtTwincome);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:tmttwincome:save")
    public R save(@RequestBody TmtTwincomeEntity tmtTwincome){
        tmtTwincomeService.save(tmtTwincome);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:tmttwincome:update")
    public R update(@RequestBody TmtTwincomeEntity tmtTwincome){
        ValidatorUtils.validateEntity(tmtTwincome);
        tmtTwincomeService.updateById(tmtTwincome);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:tmttwincome:delete")
    public R delete(@RequestBody String[] ids){
        tmtTwincomeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
