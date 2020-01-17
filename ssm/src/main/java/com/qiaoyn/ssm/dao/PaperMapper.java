package com.qiaoyn.ssm.dao;

import com.qiaoyn.ssm.entity.Paper;

import java.util.List;

/**
 * @author qiaoyn
 **/
public interface PaperMapper {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();

}
