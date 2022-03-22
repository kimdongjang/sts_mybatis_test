package com.MybatisTest.service;

import java.util.Map;

import com.MybatisTest.vo.PsoKvndDayHisVo;

public interface MybatisTestService {
	int insertPvPsoKvndDayHis(PsoKvndDayHisVo vo);
	int insertEssPsoKvndDayHis(Map map);
}
