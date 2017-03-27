package com.dk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dk.result.Result;
import com.dk.service.MapWatchDataService;

@Controller
@RequestMapping("map")
public class MapWatchDataController {
	
	@Resource
	private MapWatchDataService service;
	
	@RequestMapping("getinfos.ll")
	@ResponseBody
	public Result getInfos(){
		Result result = new Result();
		result = service.getInfos();
		return result;
	}

}
