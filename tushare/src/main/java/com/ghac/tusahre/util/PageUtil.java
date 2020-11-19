package com.ghac.tusahre.util;

import lombok.experimental.UtilityClass;
import org.springframework.data.domain.Page;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jean
 * @date
 * @des
 */
@UtilityClass
public class PageUtil {

    /**
     * 构建分页返回结果集
     * @param page
     * @return
     */
    public Map<String, Object> buildPageResult(@NotNull Page page) {
        HashMap<String, Object> data = new HashMap<>(16);
        data.put("count", page.getTotalElements());
        data.put("numberOfElement", page.getNumberOfElements());
        data.put("pageSize", page.getTotalPages());
        data.put("list", page.getContent());
        return data;
    }
}
