package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
