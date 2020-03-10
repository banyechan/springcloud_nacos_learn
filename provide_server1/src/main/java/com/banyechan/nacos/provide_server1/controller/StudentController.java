package com.banyechan.nacos.provide_server1.controller;

import com.banyechan.nacos.provide_server1.entity.StudentModel;
import com.banyechan.nacos.provide_server1.service.StudentModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentModelService studentModelService;

    @RequestMapping("/list")
    public List<StudentModel> listStudent() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<StudentModel> result = studentModelService.listByMap(map);

        return result;
    }


}
