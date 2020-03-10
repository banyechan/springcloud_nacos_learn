package com.banyechan.nacos.provide_server1.service;

import com.banyechan.nacos.provide_server1.entity.StudentModel;

import java.util.List;
import java.util.Map;

public interface StudentModelService {

    List<StudentModel> listByMap(Map<String, Object> map);

}
