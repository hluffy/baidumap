package com.dk.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dk.dao.MapWatchDataDao;
import com.dk.object.MapWatchData;
import com.dk.result.Result;
import com.dk.service.MapWatchDataService;

@Service
public class MapWatchDataServiceImpl implements MapWatchDataService{
	
	@Resource
	private MapWatchDataDao dao;

	public Result getInfos() {
		// TODO Auto-generated method stub
		Result result = new Result();
		List<MapWatchData> infos = dao.getMapWatchData();
		result.setMessage("≤È—Ø≥…π¶");
		result.setStatus(true);
		result.setData(infos);
		return result;
	}

}
