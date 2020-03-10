package com.banyechan.nacos.provide_server1.serviceImpl;

import com.banyechan.nacos.provide_server1.entity.StudentModel;
import com.banyechan.nacos.provide_server1.mapper.StudentModelMapper;
import com.banyechan.nacos.provide_server1.service.StudentModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentModelServiceImpl implements StudentModelService {

    @Autowired
    private StudentModelMapper studentModelMapper;


    @Override
    public List<StudentModel> listByMap(Map<String, Object> map) {
        return studentModelMapper.listByCondition(map);
    }

}
