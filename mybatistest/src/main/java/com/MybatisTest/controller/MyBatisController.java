package com.MybatisTest.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MybatisTest.service.MybatisTestService;
import com.MybatisTest.vo.PsoKvndDayHisVo;

@RestController
public class MyBatisController {
	@Autowired
	MybatisTestService service;
	
	@RequestMapping("/insertPvPsoKvndDayHis")
	public int insertPvPsoKvndDayHis() throws Exception {
		String resource_id="100000000000012";
 		
        LocalDate now = LocalDate.now().minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String time = now.format(formatter);
        
        PsoKvndDayHisVo vo = new PsoKvndDayHisVo();
		   vo.resource_id = resource_id;
		   vo.date = time;		
		
		return service.insertPvPsoKvndDayHis(vo);
	}

	@RequestMapping("/insertEssPsoKvndDayHis")
	public int insertEssPsoKvndDayHis() throws Exception {
		String resource_id="100000000000052";
 		
        LocalDate now = LocalDate.now().minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String date = now.format(formatter);
        int type = 3;
        
        Map map = new HashMap<String, Object>();
        map.put("resource_id", resource_id);
		map.put("date", date);
		map.put("type", type);
		
		return service.insertEssPsoKvndDayHis(map);
	}

}
