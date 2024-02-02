package repository;
import models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repository extends JpaRepository<Clientes, Long> {

}
