package com.qiaoyn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiaoyn
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String roleId;
}
