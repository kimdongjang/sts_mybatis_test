package com.MybatisTest.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.MybatisTest.vo.PsoKvndDayHisVo;

@Mapper
public interface MybatisTestDao {
	public int insertPvPsoKvndDayHis(PsoKvndDayHisVo vo);
	public int insertEssPsoKvndDayHis(Map map);
}
