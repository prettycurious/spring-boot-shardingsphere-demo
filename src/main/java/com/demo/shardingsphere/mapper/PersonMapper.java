package com.demo.shardingsphere.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.shardingsphere.core.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2024/4/19
 * Time: 18:47
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}