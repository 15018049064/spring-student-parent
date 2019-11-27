package com.service.impl;

import com.dao.DeptDao;
import com.entity.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Transactional
    @Override
    public List<Dept> getAll(int pageNum,int pageSize) {
        return deptDao.getAll(pageNum,pageSize);
    }
}
