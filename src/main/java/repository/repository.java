package repository;
import models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repository extends JpaRepository<Clients, Long> {

}
