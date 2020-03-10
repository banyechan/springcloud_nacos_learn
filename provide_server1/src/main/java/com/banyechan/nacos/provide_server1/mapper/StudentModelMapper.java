package com.banyechan.nacos.provide_server1.mapper;


import com.banyechan.nacos.provide_server1.entity.StudentModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentModel record);

    int insertSelective(StudentModel record);

    StudentModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentModel record);

    int updateByPrimaryKey(StudentModel record);

    List<StudentModel> listByCondition(Map<String, Object> map);


}