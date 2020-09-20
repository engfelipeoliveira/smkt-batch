package br.com.smktbatch.service.mapping;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import br.com.smktbatch.model.remote.Mapping;
import br.com.smktbatch.repository.remote.MappingRepository;

public class MappingServiceImplTest {

	private final MappingRepository mockMappingRepository = mock(MappingRepository.class);
	private final Mapping mockMapping = mock(Mapping.class);
	private final MappingServiceImpl underTest = new MappingServiceImpl(this.mockMappingRepository);

	@Test
	public void whenGetByCode_givenAnyCode_thenReturnDescription() {
		willReturn(mockMapping).given(mockMappingRepository).findByClientToken("token");
		
		Mapping mapping = underTest.getByClientToken("token");
		
		verify(mockMappingRepository).findByClientToken("token");
		assertThat(mapping).isEqualTo(mockMapping);
	}

}