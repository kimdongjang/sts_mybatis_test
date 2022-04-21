package com.MybatisTest.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MybatisTest.dao.MybatisTestDao;
import com.MybatisTest.vo.PsoKvndDayHisVo;
import com.MybatisTest.vo.PsoScheduleResourceVo;


@Service
public class MybatisTestServiceImpl implements MybatisTestService {
	@Autowired
	MybatisTestDao dao;
	
	@Override
	public int insertPvPsoKvndDayHis(Map map) {
		// TODO Auto-generated method stub
		return dao.insertPvPsoKvndDayHis(map);
	}

	@Override
	public int insertEssPsoKvndDayHis(Map map) {
		// TODO Auto-generated method stub
		return dao.insertEssPsoKvndDayHis(map);
	}

	@Override
	public int insertPsoScheduleResource(PsoScheduleResourceVo vo) {
		// TODO Auto-generated method stub
		return dao.insertPsoScheduleResource(vo);
	}
	@Override
	public int insertMultipyPsoQuality(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return dao.insertMultipyPsoQuality(map);
	}
	
	

}
