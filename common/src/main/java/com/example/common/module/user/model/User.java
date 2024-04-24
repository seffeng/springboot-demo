package com.example.common.module.user.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.Data;

@Data
@Table("user")
public class User {

    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 账号
     */
    private String username;
}
