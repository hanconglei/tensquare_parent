package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
//提供基本的增删改查
import org.springframework.data.jpa.repository.JpaRepository;
//用与做复杂的条件查询
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label> {

}
