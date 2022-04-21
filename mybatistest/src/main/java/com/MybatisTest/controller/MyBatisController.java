package com.MybatisTest.controller;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MybatisTest.dao.MybatisTestDao;
import com.MybatisTest.service.MybatisTestService;
import com.MybatisTest.vo.PsoScheduleResourceVo;

@RestController
public class MyBatisController {
	@Autowired
	MybatisTestService service;
	@Autowired
	MybatisTestDao dao;

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
				map.put("date",  date.toString().replace("-", ""));

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
					service.insertEssPsoKvndDayHis(map);
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
				map.put("date",  date.toString().replace("-", ""));
				map.put("type", type);
				try {
					service.insertEssPsoKvndDayHis(map);
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
		Timestamp startDate = new Timestamp(2022,4,4,0,0,0,0);
		vo.setStartTime(startDate);
		Timestamp endDate = new Timestamp(2022,4,4,12,0,0,0);
		vo.setEndTime(endDate);
		service.insertPsoScheduleResource(vo);
		return 1;
	}	
	

	@RequestMapping("/insertMultiple")
	public int insertMultipyPsoQuality() throws Exception {
		List<Map<String, Object>> qualityList = new ArrayList();				

		
		for(int i= 0; i<10; i++) {
			Timestamp date = new Timestamp(2022,4,4,0,i,0,0);
			
			Map map = new HashMap<String, Object>();
			map.put("TR", "TR" + i + "Test");
			map.put("VALUE", i);
			map.put("TYPE", "TestType");
			map.put("APPLYDATE",  date.toString());		
			
			qualityList.add(map);
		}
		Map<String, Object> dbParams = new HashMap<String, Object>();
		dbParams.put("qualityList", qualityList);		
		
		
		service.insertMultipyPsoQuality(dbParams);
		return 1;
	}	
}
