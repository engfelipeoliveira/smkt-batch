package br.com.ibout.repository.remote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ibout.model.remote.Mapping;

@Repository
public interface MappingRepository extends JpaRepository<Mapping, Long> {
	
	Mapping findByIdClient(Long idClient);
	
}
