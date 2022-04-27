package com.MybatisTest.service;

import java.util.List;
import java.util.Map;

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

public interface MybatisTestService {
	int insertPvPsoKvndDayHis(Map map);
	int insertEssPsoKvndDayHis(Map map);
	int insertPsoScheduleResource(PsoScheduleResourceVo vo);
	int insertMultipyPsoQuality(Map<String,Object> map);
	

	public List<PsoEssSchedule> getPsoEssScheduleList(String whereCond) throws Exception;
	public List<PsoForecastPv> getPsoForecastPvList(String whereCond) throws Exception;
	public List<PsoPredictWeather> getPsoPredictWeatherList(String whereCond) throws Exception;
	public int insertPsoPredictWeather(PsoPredictWeather psoPredictWeather) throws Exception;
	public List<PsoPsBranch> getPsoPsBranchList(String whereCond) throws Exception;
	public List<PsoPsBus> getPsoPsBusList(String whereCond) throws Exception;
	public List<PsoPsGenerator> getPsoPsGeneratorList(String whereCond) throws Exception;
	public List<PsoPsLoad> getPsoPsLoadList(String whereCond) throws Exception;
	public List<PsoPsWindingTransformer2> getPsoPsWindingTransformer2List(String whereCond) throws Exception;
	public List<PsoResultBranch> getPsoResultBranchList(String whereCond) throws Exception;
	public List<PsoResultBus> getPsoResultBusList(String whereCond) throws Exception;
	public List<PsoResultLoad> getPsoResultLoadList(String whereCond) throws Exception;
	public List<PsoResultTr2> getPsoResultTr2List(String whereCond) throws Exception;
	public List<PsoScheduleResource> getPsoScheduleResourceList(String whereCond) throws Exception;
	public List<PsoWeather> getPsoWeatherList(String whereCond) throws Exception;
	public int insertPsoWeather(PsoWeather psoWeather) throws Exception;
	public List<RtfsResult> getRtfsResultList(String whereCond) throws Exception;
	public List<RtpfResult> getRtpfResultList(String whereCond) throws Exception;
	public List<RtpfResultHis> getRtpfResultHisList(String whereCond) throws Exception;
	public List<PsoEssConfig> getPsoEssConfigList(String whereCond) throws Exception;
	public List<PsoHisMapping> getPsoHisMappingList(String whereCond) throws Exception;
	public List<PsoMgSupplyStateHis> getPsoMgSupplyStateHisList(String whereCond) throws Exception;
	public List<PsoResource> getPsoResourceList(String whereCond) throws Exception;
	public List<PsoPredictIsolationHis> getPsoPredictIsolationHisList(String whereCond) throws Exception;

	public int insertPvPsoKvndDayHis(String resource_id, String date) throws Exception;
	public int insertEssPsoKvndDayHis(String resource_id, String date, String type) throws Exception;

	public List<PsoKvndDayHis> getPsoKvndDayHisList(String whereCond) throws Exception;
	
	public int insertPsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception;
	public int updatePsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception;
	public int deletePsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception;
	
	public List<PsoQuality>getPsoQualityList(String whereCond) throws Exception;
	public int insertPsoQuality(PsoQuality psoQuality) throws Exception;
	public int insertMultiplePsoQuality(Map map) throws Exception;
	public List<PsoQualityConfig>getPsoQualityConfigList(String whereCond) throws Exception;
	public int insertPsoQualityConfig(PsoQualityConfig psoQualityConfig) throws Exception;
	public List<PsoFaultResult> getPsoFaultResultList(String whereCond) throws Exception;
	
}
