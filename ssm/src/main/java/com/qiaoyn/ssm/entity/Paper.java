package com.qiaoyn.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiaoyn
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {

    private long paperId;
    private String paperName;
    private int paperNum;
    private String paperDetail;
}
