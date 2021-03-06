package br.com.ibout.model.remote;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.ibout.enums.StatusJob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long idClient;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	@Enumerated(EnumType.STRING)
	private StatusJob status;
	
	private int productInsert;
	
	private int productUpdate;
	
	private int productDelete;
	
	private int fileSize;
	
	private int dbLocalSize;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = ErrorJob.class, mappedBy = "job")
	private Set<ErrorJob> errors;

}
