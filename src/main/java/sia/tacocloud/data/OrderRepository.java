package sia.tacocloud.data;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import sia.tacocloud.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
