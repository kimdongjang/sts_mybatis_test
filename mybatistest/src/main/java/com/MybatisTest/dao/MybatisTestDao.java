package com.MybatisTest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.MybatisTest.vo.PsoKvndDayHisVo;
import com.MybatisTest.vo.PsoScheduleResourceVo;

@Mapper
public interface MybatisTestDao {
	public int insertPvPsoKvndDayHis(Map map);
	public int insertEssPsoKvndDayHis(Map map);
	public int insertPsoScheduleResource(PsoScheduleResourceVo vo);
	public int insertMultipyPsoQuality(Map<String,Object> map);
}
