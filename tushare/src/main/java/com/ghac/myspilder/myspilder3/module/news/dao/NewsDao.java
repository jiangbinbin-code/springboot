package com.ghac.myspilder.myspilder3.module.news.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghac.myspilder.myspilder3.module.news.entity.NewsEntity;
import org.apache.ibatis.annotations.Mapper;
/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
