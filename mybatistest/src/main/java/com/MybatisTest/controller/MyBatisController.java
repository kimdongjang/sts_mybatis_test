package com.MybatisTest.controller;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MybatisTest.dao.PsoMapper;
import com.MybatisTest.service.MybatisTestService;
import com.MybatisTest.vo.PsoScheduleResourceVo;
import com.kepco.epcm.model.db.pso.PsoQuality;
import com.kepco.epcm.model.db.pso.PsoQualityConfig;
import com.kepco.epcm.model.db.pso.PsoScheduleResource;
import com.kepco.epcm.model.service.BaseRestApiController;
import com.kepco.epcm.model.service.EpcmRestApiResult;

@RestController
public class MyBatisController extends BaseRestApiController {
	@Autowired
	MybatisTestService psoService;
	@Autowired
	PsoMapper dao;

	@RequestMapping("/insertPvPsoKvndDayHis")
	public int insertPvPsoKvndDayHis() throws Exception {
		LocalDate startDate = LocalDate.parse("2022-01-01");
		LocalDate endDate = LocalDate.parse("2022-03-28");

		String resource_id = "100000000000011";
//			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			Map map = new HashMap<String, Object>();
			map.put("RESOURCE_ID", resource_id);
			map.put("date", date.toString().replace("-", ""));
			System.out.println(resource_id);

			try {
				dao.insertPvPsoKvndDayHis(map);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
//				service.insertPvPsoKvndDayHis(map);
		}

		resource_id = "100000000000012";
//			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			Map map = new HashMap<String, Object>();
			map.put("RESOURCE_ID", resource_id);
			map.put("date", date.toString().replace("-", ""));

			try {
				dao.insertPvPsoKvndDayHis(map);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
//				service.insertPvPsoKvndDayHis(map);
		}
		return 1;

	}

	@RequestMapping("/insertEssPsoKvndDayHis")
	public int insertEssPsoKvndDayHis() throws Exception {

		LocalDate startDate = LocalDate.parse("2022-01-01");
		LocalDate endDate = LocalDate.parse("2022-03-28");

		String resource_id = "100000000000051";
		int type = 3;
//			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			Map map = new HashMap<String, Object>();
			map.put("RESOURCE_ID", resource_id);
			map.put("date", date.toString().replace("-", ""));
			map.put("type", type);
			System.out.println(resource_id);

			try {
				psoService.insertEssPsoKvndDayHis(map);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

		resource_id = "100000000000052";
//			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			Map map = new HashMap<String, Object>();
			map.put("RESOURCE_ID", resource_id);
			map.put("date", date.toString().replace("-", ""));
			map.put("type", type);
			try {
				psoService.insertEssPsoKvndDayHis(map);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

		return 1;
	}

	@RequestMapping("/insertScheduleResource")
	public int insertScheduleResource() throws Exception {
		PsoScheduleResourceVo vo = new PsoScheduleResourceVo();
		vo.setPsoResourceId(1404);
		vo.setTypeName("CON");
		vo.setIedName("IED-PV25");
		vo.setEquipmentName("MPPT#7-3");
		vo.setDescription("테스트1");
		Timestamp startDate = new Timestamp(2022, 4, 4, 0, 0, 0, 0);
		vo.setStartTime(startDate);
		Timestamp endDate = new Timestamp(2022, 4, 4, 12, 0, 0, 0);
		vo.setEndTime(endDate);
		psoService.insertPsoScheduleResource(vo);
		return 1;
	}

	@RequestMapping("/insertMultiple")
	public int insertMultipyPsoQuality() throws Exception {
		List<Map<String, Object>> qualityList = new ArrayList();

		for (int i = 0; i < 10; i++) {
			Timestamp date = new Timestamp(2022, 4, 4, 0, i, 0, 0);

			Map map = new HashMap<String, Object>();
			map.put("TR", "TR" + i + "Test");
			map.put("VALUE", i);
			map.put("TYPE", "TestType");
			map.put("APPLYDATE", date.toString());

			qualityList.add(map);
		}
		Map<String, Object> dbParams = new HashMap<String, Object>();
		dbParams.put("qualityList", qualityList);

		psoService.insertMultipyPsoQuality(dbParams);
		return 1;
	}

	@GetMapping(value = "/ess-schedule")
	public EpcmRestApiResult getPsoEssScheduleList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoEssScheduleList(whereCond));
	}

	@GetMapping(value = "/forecast-pv")
	public EpcmRestApiResult getPsoForecastPvList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoForecastPvList(whereCond));
	}

	@GetMapping(value = "/predict-weather")
	public EpcmRestApiResult getPsoPredictWeatherList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoPredictWeatherList(whereCond));
	}

	@GetMapping(value = "/ps-branch")
	public EpcmRestApiResult getPsoPsBranchList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoPsBranchList(whereCond));
	}

	@GetMapping(value = "/ps-bus")
	public EpcmRestApiResult getPsoPsBusList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoPsBusList(whereCond));
	}

	@GetMapping(value = "/ps-generator")
	public EpcmRestApiResult getPsoPsGeneratorList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoPsGeneratorList(whereCond));
	}

	@GetMapping(value = "/ps-load")
	public EpcmRestApiResult getPsoPsLoadList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoPsLoadList(whereCond));
	}

	@GetMapping(value = "/ps-winding-transformer2")
	public EpcmRestApiResult getPsoPsWindingTransformer2List(@RequestParam("whereCond") String whereCond)
			throws Exception {
		return convertRestApiResult(psoService.getPsoPsWindingTransformer2List(whereCond));
	}

	@GetMapping(value = "/result-branch")
	public EpcmRestApiResult getPsoResultBranchList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoResultBranchList(whereCond));
	}

	@GetMapping(value = "/result-bus")
	public EpcmRestApiResult getPsoResultBusList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoResultBusList(whereCond));
	}

	@GetMapping(value = "/result-load")
	public EpcmRestApiResult getPsoResultLoadList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoResultLoadList(whereCond));
	}

	@GetMapping(value = "/result-tr2")
	public EpcmRestApiResult getPsoResultTr2List(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoResultTr2List(whereCond));
	}


	@GetMapping(value = "/weather")
	public EpcmRestApiResult getPsoWeatherList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoWeatherList(whereCond));
	}

	@GetMapping(value = "/rtfs-result")
	public EpcmRestApiResult getRtfsResultList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getRtfsResultList(whereCond));
	}

	@GetMapping(value = "/rtpf-result")
	public EpcmRestApiResult getRtpfResultList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getRtpfResultList(whereCond));
	}

	@GetMapping(value = "/rtpf-result-his")
	public EpcmRestApiResult getRtpfResultHisList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getRtpfResultHisList(whereCond));
	}

	@GetMapping(value = "/ess-config")
	public EpcmRestApiResult getPsoEssConfigList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoEssConfigList(whereCond));
	}

	@GetMapping(value = "/his-mapping")
	public EpcmRestApiResult getPsoHisMapping(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoHisMappingList(whereCond));
	}

	@GetMapping(value = "/mg-supply-state-his")
	public EpcmRestApiResult getPsoMgSupplyStateHisList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoMgSupplyStateHisList(whereCond));
	}

	@GetMapping(value = "/resource")
	public EpcmRestApiResult getPsoResourceList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoResourceList(whereCond));
	}

	@GetMapping(value = "/predict-isolation-his")
	public EpcmRestApiResult getPsoPredictIsolationHisList(@RequestParam("whereCond") String whereCond)
			throws Exception {
		return convertRestApiResult(psoService.getPsoPredictIsolationHisList(whereCond));
	}

	@GetMapping(value = "/kvnd-day-his")
	public EpcmRestApiResult getPsoKvndDayHisList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoKvndDayHisList(whereCond));
	}
	
	@GetMapping(value = "/schedule-resource")
	public EpcmRestApiResult getPsoScheduleResourceList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoScheduleResourceList(whereCond));
	}

	@PostMapping(value = "/schedule-resource")
	public EpcmRestApiResult insertPsoScheduleResource(@RequestBody PsoScheduleResource psoParam) throws Exception {
		return convertRestApiResult(psoService.insertPsoScheduleResource(psoParam), psoParam);
	}

	@PutMapping(value = "/schedule-resource")
	public EpcmRestApiResult updatePsoScheduleResource(@RequestBody PsoScheduleResource psoParam) throws Exception {
		return convertRestApiResult(psoService.updatePsoScheduleResource(psoParam));
	}

	@DeleteMapping(value = "/schedule-resource")
	public EpcmRestApiResult deletePsoScheduleResource(@RequestBody PsoScheduleResource psoParam) throws Exception {
		return convertRestApiResult(psoService.deletePsoScheduleResource(psoParam));
	}

	@GetMapping(value = "/quality")
	public EpcmRestApiResult getPsoQualityList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoQualityList(whereCond));
	}

	@PostMapping(value = "/quality")
	public EpcmRestApiResult insertPsoQuality(@RequestBody PsoQuality psoParam) throws Exception {
		return convertRestApiResult(psoService.insertPsoQuality(psoParam), psoParam);
	}

	@GetMapping(value = "/quality-config")
	public EpcmRestApiResult getPsoQualityConfigList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoQualityConfigList(whereCond));
	}

	@PostMapping(value = "/quality-config")
	public EpcmRestApiResult insertPsoQualityConfig(@RequestBody PsoQualityConfig psoParam) throws Exception {
		return convertRestApiResult(psoService.insertPsoQualityConfig(psoParam), psoParam);
	}

	@GetMapping(value = "/fault-result")
	public EpcmRestApiResult getPsoFaultResultList(@RequestParam("whereCond") String whereCond) throws Exception {
		return convertRestApiResult(psoService.getPsoFaultResultList(whereCond));
	}
}
