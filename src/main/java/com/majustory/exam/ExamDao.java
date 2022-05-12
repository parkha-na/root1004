package com.majustory.exam;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ExamDao {
	
	List<ExamVo> select();
	void insert(ExamVo vo);
	ExamVo content(ExamVo vo);
}
