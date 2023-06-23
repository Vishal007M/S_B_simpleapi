package com.allegient.AuthanticationApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataEntityServicesImpl implements DataEntityServices {
	
	@Autowired
	private DataEntityDao eDao;

	@Override
	public DataEntity addEntity(DataEntity e) {
		// TODO Auto-generated method stub
		return eDao.save(e);
	}

	@Override
	public List<DataEntity> getEntity() {
		return eDao.findAll();
	}

}
