package com.allegient.AuthanticationApi;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface DataEntityServices {

	public DataEntity addEntity(DataEntity e);

	public List<DataEntity> getEntity();

	public void deleteById(int dataEntityId);


	public DataEntity reset(int dataEntityId, Map<Object, Object> dataEntity);

	public DataEntity getIdEntity(int dataEntityId);
	



}
