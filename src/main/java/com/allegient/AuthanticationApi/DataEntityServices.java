package com.allegient.AuthanticationApi;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DataEntityServices {

	public DataEntity addEntity(DataEntity e);

	public List<DataEntity> getEntity();



}
