package br.com.smktbatch.service.product;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import br.com.smktbatch.model.local.Product;
import br.com.smktbatch.repository.local.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	private static final Logger LOG = getLogger(ProductServiceImpl.class);

	ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product createOrUpdate(Product product) {
		LOG.info("createOrUpdate()");
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		LOG.info("getAll()");
		return this.productRepository.findAll();
	}

}
