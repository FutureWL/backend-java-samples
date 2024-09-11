package io.github.futurewl.sbs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.futurewl.sbs.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
