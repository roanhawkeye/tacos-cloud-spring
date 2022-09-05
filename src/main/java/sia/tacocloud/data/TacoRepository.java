package sia.tacocloud.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import sia.tacocloud.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
  
}
