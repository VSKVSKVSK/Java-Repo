package com.vs.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author velvetshiki
 * @since 2024-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    // @Serial
    // private static final long serialVersionUID = 1L;

    /**
     * 用户uid
     */
    // @TableId(value = "uid", type = IdType.AUTO)
    // private Integer uid;

    /**
     * 用户名
     */
    @TableId(value = "name")
    private String name;
    private String password;
    private String role;
}
