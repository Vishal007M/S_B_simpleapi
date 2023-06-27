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
		return eDao.save(e);
	}

	@Override
	public List<DataEntity> getEntity() {
		return eDao.findAll();
	}

	@Override
	public void deleteById(int dataEntityId) {
		 eDao.deleteById(dataEntityId);
	}

}
