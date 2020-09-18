package br.com.smktbatch.service.parameter;

import java.util.List;

import br.com.smktbatch.model.remote.Parameter;

public interface ParameterService {
	
	Parameter getParameterByClientToken(String token) throws Exception;
	List<String> validateParameters(Parameter parameter);

}
