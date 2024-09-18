package com.demo.shardingsphere.core;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2024/4/19
 * Time: 15:12
 */
@Data
@Entity
@TableName("person")
public class Person {

    @Id
    @TableId
    private Long id;
    private String name;
    private int age;
//    @Transient
//    @TableField(exist = false)
    private String idCard;
    private String telephone;
    private String username;
    private String usernameCipher;
    private String email;
}
