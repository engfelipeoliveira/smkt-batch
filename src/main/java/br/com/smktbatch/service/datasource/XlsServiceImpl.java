package br.com.smktbatch.service.datasource;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import br.com.smktbatch.model.remote.Mapping;
import br.com.smktbatch.model.remote.Parameter;

@Service
public class XlsServiceImpl implements DataSourceService {

	private static final Logger LOG = getLogger(XlsServiceImpl.class);

	@Override
	public void read(Parameter parameter, Mapping mapping) {
		LOG.info("read()");

	}

}
