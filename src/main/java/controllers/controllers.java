package controllers;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import models.Alumno;
import repository.repository;

import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class controllers {

    @Autowired
     private repository repo;

    @GetMapping
    public String index(){
      return "Conectado";
   }
    
   @GetMapping("alumnos")
    public List<Alumno> getAlumnos() {
        return repo.findAll();
    }


    @PostMapping("alta")
    public String post(@RequestBody Alumno alumno) {
        repo.save(alumno);
        //TODO: process POST request
        
        return "Guardado";
    }

    @PostMapping("modificar/{idAlumno}") 
      public String  update(@PathVariable long Id, @RequestBody Alumno alumno) {
           Alumno updateAlumno = repo.findById(alumno).get();
           updateAlumno.setPrimerNombre(alumno.getPrimerNombre());
           updateAlumno.setNombrePosteriores(alumno.getNombrePosteriores());
           updateAlumno.setprimerApellido(alumno.getprimerApellido());
           updateAlumno.setSegundoApellido(alumno.getSegundoApellido());
           updateAlumno.setEdad(alumno.getEdad());
           updateAlumno.setNota(alumno.getNota());
           repo.save(updateAlumno);

           return "Modificado";

      }   

    @DeleteMapping("baja/{idAlumno}")  
        public String delete(@PathVariable long idAlumno)   {
            
            Alumno deleteAlumno = repo.findById(idAlumno).get();
            repo.delete(deleteAlumno);

            return "Eliminado";

      }



    

    
 
}
