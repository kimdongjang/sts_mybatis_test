package com.MybatisTest.service;

import java.util.List;
import java.util.Map;

import com.MybatisTest.vo.PsoScheduleResourceVo;

public interface MybatisTestService {
	int insertPvPsoKvndDayHis(Map map);
	int insertEssPsoKvndDayHis(Map map);
	int insertPsoScheduleResource(PsoScheduleResourceVo vo);
	int insertMultipyPsoQuality(Map<String,Object> map);
}
