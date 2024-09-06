package com.demo.shardingsphere.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.shardingsphere.core.Person;
import com.demo.shardingsphere.mapper.PersonMapper;
import com.demo.shardingsphere.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2024/4/19
 * Time: 18:45
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
}
