package br.com.smktbatch.service;

import org.springframework.stereotype.Service;

import br.com.smktbatch.model.Parameter;
import br.com.smktbatch.repository.ParameterRepository;

@Service
public class ParameterServiceImpl implements ParameterService {

	private final ParameterRepository parameterRepository;
	
	ParameterServiceImpl(ParameterRepository parameterRepository){
		this.parameterRepository = parameterRepository;
	}
	
	@Override
	public Parameter getParameterByClient(Long idClient) {
		return this.parameterRepository.findByIdClient(idClient);
	}
	

}
