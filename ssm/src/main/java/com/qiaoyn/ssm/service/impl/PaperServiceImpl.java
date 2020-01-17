package com.qiaoyn.ssm.service.impl;

import com.qiaoyn.ssm.dao.PaperMapper;
import com.qiaoyn.ssm.entity.Paper;
import com.qiaoyn.ssm.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiaoyn
 **/
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;


    public int addPaper(Paper paper) {
        return paperMapper.addPaper(paper);
    }


    public int deletePaperById(long id) {
        return paperMapper.deletePaperById(id);
    }


    public int updatePaper(Paper paper) {
        return paperMapper.updatePaper(paper);
    }


    public Paper queryById(long id) {
        return paperMapper.queryById(id);
    }


    public List<Paper> queryAllPaper() {
        return paperMapper.queryAllPaper();
    }

}
