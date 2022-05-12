package com.majustory.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDao dao;
	@Override
	public List<ExamVo> select() {
		return dao.select();
	}
	@Override
	public void insert(ExamVo vo) {
		dao.insert(vo);
	}
	@Override
	public ExamVo content(ExamVo vo) {
		return dao.content(vo);
	}

}
