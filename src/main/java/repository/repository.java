package repository;
import models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
 


public interface repository extends JpaRepository<Alumno, long > {

}
