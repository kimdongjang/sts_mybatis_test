package com.MybatisTest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.MybatisTest.vo.PsoScheduleResourceVo;
import com.kepco.epcm.model.db.pso.PsoEssConfig;
import com.kepco.epcm.model.db.pso.PsoEssSchedule;
import com.kepco.epcm.model.db.pso.PsoFaultResult;
import com.kepco.epcm.model.db.pso.PsoForecastPv;
import com.kepco.epcm.model.db.pso.PsoHisMapping;
import com.kepco.epcm.model.db.pso.PsoKvndDayHis;
import com.kepco.epcm.model.db.pso.PsoMgSupplyStateHis;
import com.kepco.epcm.model.db.pso.PsoPredictIsolationHis;
import com.kepco.epcm.model.db.pso.PsoPredictWeather;
import com.kepco.epcm.model.db.pso.PsoPsBranch;
import com.kepco.epcm.model.db.pso.PsoPsBus;
import com.kepco.epcm.model.db.pso.PsoPsGenerator;
import com.kepco.epcm.model.db.pso.PsoPsLoad;
import com.kepco.epcm.model.db.pso.PsoPsWindingTransformer2;
import com.kepco.epcm.model.db.pso.PsoQuality;
import com.kepco.epcm.model.db.pso.PsoQualityConfig;
import com.kepco.epcm.model.db.pso.PsoResource;
import com.kepco.epcm.model.db.pso.PsoResultBranch;
import com.kepco.epcm.model.db.pso.PsoResultBus;
import com.kepco.epcm.model.db.pso.PsoResultLoad;
import com.kepco.epcm.model.db.pso.PsoResultTr2;
import com.kepco.epcm.model.db.pso.PsoScheduleResource;
import com.kepco.epcm.model.db.pso.PsoWeather;
import com.kepco.epcm.model.db.pso.RtfsResult;
import com.kepco.epcm.model.db.pso.RtpfResult;
import com.kepco.epcm.model.db.pso.RtpfResultHis;

@Mapper
public interface PsoMapper {
	public int insertPsoScheduleResource(PsoScheduleResourceVo vo);
	public int insertMultipyPsoQuality(Map<String,Object> map);
	

	public List<PsoEssSchedule> selectPsoEssSchedule(String whereCond);

	public List<PsoForecastPv> selectPsoForecastPv(String whereCond);

	public List<PsoPsBranch> selectPsoPsBranch(String whereCond);

	public List<PsoPsBus> selectPsoPsBus(String whereCond);

	public List<PsoPsGenerator> selectPsoPsGenerator(String whereCond);

	public List<PsoPsLoad> selectPsoPsLoad(String whereCond);

	public List<PsoPsWindingTransformer2> selectPsoPsWindingTransformer2(String whereCond);

	public List<PsoResultBranch> selectPsoResultBranch(String whereCond);

	public List<PsoResultBus> selectPsoResultBus(String whereCond);

	public List<PsoResultLoad> selectPsoResultLoad(String whereCond);

	public List<PsoResultTr2> selectPsoResultTr2(String whereCond);

	public List<PsoScheduleResource> selectPsoScheduleResource(String whereCond);

	public List<PsoWeather> selectPsoWeather(String whereCond);
	
	public List<PsoPredictWeather> selectPsoPredictWeather(String whereCond);
	
	public List<RtfsResult> selectRtfsResult(String whereCond);

	public List<RtpfResult> selectRtpfResult(String whereCond);

	public List<RtpfResultHis> selectRtpfResultHis(String whereCond);
	
	public List<PsoEssConfig> selectPsoEssConfig(String whereCond);
	
	public List<PsoHisMapping> selectPsoHisMapping(String whereCond);
	
	public List<PsoMgSupplyStateHis> selectPsoMgSupplyStateHis(String whereCond);
	
	public List<PsoResource> selectPsoResource(String whereond);
	
	public List<PsoPredictIsolationHis> selectPsoPredictIsolationHis(String whereond);
	
	public int insertPsoWeather(PsoWeather psoWeather);

	public int insertPsoPredictWeather(PsoPredictWeather psoPredictWeather);
	
	public int insertPvPsoKvndDayHis(Map map);
	
	public int insertEssPsoKvndDayHis(Map map);

	public List<PsoKvndDayHis> selectPsoKvndDayHis(String whereCond);
	
	public int insertPsoScheduleResource(PsoScheduleResource psoScheduleResource);
	public int updatePsoScheduleResource(PsoScheduleResource psoScheduleResource);
	public int deletePsoScheduleResource(PsoScheduleResource psoScheduleResource);
	
	public List<PsoQuality> selectPsoQualityList(String whereCond);
	public int insertPsoQuality(PsoQuality psoQuality);
	public int insertMultiplePsoQuality(Map map);
	public List<PsoQualityConfig> selectPsoQualityConfigList(String whereCond);
	public int insertPsoQualityConfig(PsoQualityConfig psoQualityConfig);
	public List<PsoFaultResult> selectPsoFaultResultList(String whereCond);
	
}
