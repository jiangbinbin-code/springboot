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

import io.renren.modules.sys.entity.TmtTwincomedetailEntity;
import io.renren.modules.sys.service.TmtTwincomedetailService;
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
@RequestMapping("sys/tmttwincomedetail")
public class TmtTwincomedetailController {
    @Autowired
    private TmtTwincomedetailService tmtTwincomedetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:tmttwincomedetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmtTwincomedetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:tmttwincomedetail:info")
    public R info(@PathVariable("id") String id){
        TmtTwincomedetailEntity tmtTwincomedetail = tmtTwincomedetailService.getById(id);

        return R.ok().put("tmtTwincomedetail", tmtTwincomedetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:tmttwincomedetail:save")
    public R save(@RequestBody TmtTwincomedetailEntity tmtTwincomedetail){
        tmtTwincomedetailService.save(tmtTwincomedetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:tmttwincomedetail:update")
    public R update(@RequestBody TmtTwincomedetailEntity tmtTwincomedetail){
        ValidatorUtils.validateEntity(tmtTwincomedetail);
        tmtTwincomedetailService.updateById(tmtTwincomedetail);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:tmttwincomedetail:delete")
    public R delete(@RequestBody String[] ids){
        tmtTwincomedetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
