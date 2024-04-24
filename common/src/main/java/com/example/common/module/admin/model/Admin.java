package com.example.common.module.admin.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.Data;

@Data
@Table("admin")
public class Admin {

    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 创建时间
     */
    private Long createdAt;
}
