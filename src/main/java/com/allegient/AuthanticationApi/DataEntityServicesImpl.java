package com.allegient.AuthanticationApi;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;


@Service
public class DataEntityServicesImpl implements DataEntityServices {
	
	@Autowired
	private DataEntityDao eDao;

	@Override
	public List<DataEntity> getEntity() {
		return eDao.findAll();
	}
	

	@Override
	public DataEntity getIdEntity(int dataEntityId) {
		return eDao.findById(dataEntityId).get();
	}
	
	@Override
	public DataEntity addEntity(DataEntity e) {
		return eDao.save(e);
	}
	

	@Override
	public void deleteById(int dataEntityId) {
		 eDao.deleteById(dataEntityId);
	}

	@Override
	public DataEntity reset(int dataEntityId, Map<Object, Object> dataEntity) {
		 Optional<DataEntity> userExist = eDao.findById(dataEntityId);

			if (userExist.isPresent()) {
				dataEntity.forEach((key,Value) ->{
				    Field field = ReflectionUtils.findField(DataEntity.class, (String) key);
					field.setAccessible(true);
					ReflectionUtils.setField(field, userExist.get(), Value);

				});
				return eDao.save(userExist.get());
			}
			return null;
	}



}
