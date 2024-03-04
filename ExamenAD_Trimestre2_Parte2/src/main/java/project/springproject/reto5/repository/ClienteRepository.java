package project.springproject.reto5.repository;

import org.springframework.data.repository.query.Param;
import project.springproject.reto5.model.Cliente;

public interface ClienteRepository {
    Cliente findByClientId(@Param("id") Long id);

}
