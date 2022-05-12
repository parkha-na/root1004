package com.majustory.exam;

import java.util.List;

public interface ExamService {
	
	List<ExamVo> select();
	void insert(ExamVo vo);
	ExamVo content(ExamVo vo);
		
}
