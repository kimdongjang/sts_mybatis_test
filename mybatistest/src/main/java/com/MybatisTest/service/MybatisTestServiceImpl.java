package com.MybatisTest.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MybatisTest.dao.MybatisTestDao;
import com.MybatisTest.vo.PsoKvndDayHisVo;


@Service
public class MybatisTestServiceImpl implements MybatisTestService {
	@Autowired
	MybatisTestDao dao;
	
	@Override
	public int insertPvPsoKvndDayHis(PsoKvndDayHisVo vo) {
		// TODO Auto-generated method stub
		return dao.insertPvPsoKvndDayHis(vo);
	}

	@Override
	public int insertEssPsoKvndDayHis(Map map) {
		// TODO Auto-generated method stub
		return dao.insertEssPsoKvndDayHis(map);
	}
	

}
