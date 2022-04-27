package com.MybatisTest.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MybatisTest.dao.PsoMapper;
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


@Service
public class MybatisTestServiceImpl implements MybatisTestService {
	@Autowired
	PsoMapper psoMapper;
	
	@Override
	public int insertPvPsoKvndDayHis(Map map) {
		// TODO Auto-generated method stub
		return psoMapper.insertPvPsoKvndDayHis(map);
	}

	@Override
	public int insertEssPsoKvndDayHis(Map map) {
		// TODO Auto-generated method stub
		return psoMapper.insertEssPsoKvndDayHis(map);
	}

	@Override
	public int insertPsoScheduleResource(PsoScheduleResourceVo vo) {
		// TODO Auto-generated method stub
		return psoMapper.insertPsoScheduleResource(vo);
	}
	@Override
	public int insertMultipyPsoQuality(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return psoMapper.insertMultipyPsoQuality(map);
	}

	public PsoMapper getpsoMapper() {
		return psoMapper;
	}

	public void setpsoMapper(PsoMapper psoMapper) {
		this.psoMapper = psoMapper;
	}

	@Override
	public List<PsoEssSchedule> getPsoEssScheduleList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoEssSchedule(whereCond);
	}



	@Override
	public List<PsoForecastPv> getPsoForecastPvList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoForecastPv(whereCond);
	}



	@Override
	public List<PsoPredictWeather> getPsoPredictWeatherList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPredictWeather(whereCond);
	}



	@Override
	public List<PsoPsBranch> getPsoPsBranchList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPsBranch(whereCond);
	}



	@Override
	public List<PsoPsBus> getPsoPsBusList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPsBus(whereCond);
	}



	@Override
	public List<PsoPsGenerator> getPsoPsGeneratorList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPsGenerator(whereCond);
	}



	@Override
	public List<PsoPsLoad> getPsoPsLoadList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPsLoad(whereCond);
	}



	@Override
	public List<PsoPsWindingTransformer2> getPsoPsWindingTransformer2List(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPsWindingTransformer2(whereCond);
	}



	@Override
	public List<PsoResultBranch> getPsoResultBranchList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoResultBranch(whereCond);
	}



	@Override
	public List<PsoResultBus> getPsoResultBusList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoResultBus(whereCond);
	}



	@Override
	public List<PsoResultLoad> getPsoResultLoadList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoResultLoad(whereCond);
	}



	@Override
	public List<PsoResultTr2> getPsoResultTr2List(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoResultTr2(whereCond);
	}



	@Override
	public List<PsoScheduleResource> getPsoScheduleResourceList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoScheduleResource(whereCond);
	}



	@Override
	public List<PsoWeather> getPsoWeatherList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoWeather(whereCond);
	}



	@Override
	public List<RtfsResult> getRtfsResultList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectRtfsResult(whereCond);
	}



	@Override
	public List<RtpfResult> getRtpfResultList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectRtpfResult(whereCond);
	}



	@Override
	public List<RtpfResultHis> getRtpfResultHisList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectRtpfResultHis(whereCond);
	}

	@Override
	public List<PsoEssConfig> getPsoEssConfigList(String whereCond) throws Exception {
		return psoMapper.selectPsoEssConfig(whereCond);
	}

	@Override
	public List<PsoHisMapping> getPsoHisMappingList(String whereCond) throws Exception {
		return psoMapper.selectPsoHisMapping(whereCond);
	}

	@Override
	public int insertPsoPredictWeather(PsoPredictWeather psoPredictWeather) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.insertPsoPredictWeather(psoPredictWeather);
	}

	@Override
	public int insertPsoWeather(PsoWeather psoWeather) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.insertPsoWeather(psoWeather);
	}

	@Override
	public List<PsoMgSupplyStateHis> getPsoMgSupplyStateHisList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoMgSupplyStateHis(whereCond);
	}
	@Override
	public List<PsoResource> getPsoResourceList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoResource(whereCond);
	}

	@Override
	public List<PsoPredictIsolationHis> getPsoPredictIsolationHisList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoPredictIsolationHis(whereCond);
	}

	@Override
	public int insertPvPsoKvndDayHis(String resource_id, String date) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("resource_id", resource_id);
		map.put("date", date);
		
		return psoMapper.insertPvPsoKvndDayHis(map);
	}
	
	@Override
	public int insertEssPsoKvndDayHis(String resource_id, String date, String type) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("resource_id", resource_id);
		map.put("date", date);
		map.put("type", type);
		
		return psoMapper.insertEssPsoKvndDayHis(map);
	}

	@Override
	public List<PsoKvndDayHis> getPsoKvndDayHisList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoKvndDayHis(whereCond);
	}
	

	public int insertPsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception{
		return psoMapper.insertPsoScheduleResource(psoScheduleResource);
	}

	public int updatePsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception{
		return psoMapper.updatePsoScheduleResource(psoScheduleResource);
	}

	public int deletePsoScheduleResource(PsoScheduleResource psoScheduleResource) throws Exception{
		return psoMapper.deletePsoScheduleResource(psoScheduleResource);
	}

	@Override
	
	public List<PsoQuality> getPsoQualityList(String whereCond) throws Exception {
		return psoMapper.selectPsoQualityList(whereCond);
	}
	@Override
	public int insertPsoQuality(PsoQuality psoQuality) throws Exception {
		return psoMapper.insertPsoQuality(psoQuality);
	}
	

	@Override
	public List<PsoQualityConfig> getPsoQualityConfigList(String whereCond) throws Exception {
		return psoMapper.selectPsoQualityConfigList(whereCond);
	}		
	@Override
	public int insertPsoQualityConfig(PsoQualityConfig psoQualityConfig) throws Exception {
		return psoMapper.insertPsoQualityConfig(psoQualityConfig);
	}	
	@Override
	public int insertMultiplePsoQuality(Map map) throws Exception{
		return psoMapper.insertMultiplePsoQuality(map);
	}

	@Override
	public List<PsoFaultResult> getPsoFaultResultList(String whereCond) throws Exception {
		// TODO Auto-generated method stub
		return psoMapper.selectPsoFaultResultList(whereCond);
	}
	
	



}
