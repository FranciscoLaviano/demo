package controllers;

import models.Clientes;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.Repository;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import repository.repository;
import java.lang.String;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class controllers {

    @Autowired
     private repository repo;

    @GetMapping
    public String index(){
      return "Conectado";
   }

   @GetMapping("clients")
    public List<Clientes> getIdClients() {
        return repo.findAll();
    }


    @PostMapping("alta")
    public String post(@RequestBody Clientes clientes) {
        repo.save(clientes);
        //TODO: process POST request
        
        return "Guardado";
    }

    @PostMapping("modificar/{idCliente}")
    @Id
      public String  update(@PathVariable long Id, @RequestBody Clientes clientes) {

        Clientes updateClientes = repo.findById(Clientes).getIdClientes();
           updateClientes.setNombre(clientes.getNombre());
           updateClientes.setNombresPosteriores(clientes.getNombresPosteriores());
           updateClientes.setPrimerApellido(clientes.getPrimerApellido());
           updateClientes.setSegundoApellido(clientes.getSegundoApellido());
           updateClientes.setMail(clientes.getMail());

           repo.save(updateClientes);

           return "Modificado";

      }   

    @DeleteMapping("baja/{idCliente}")
        public String delete(@PathVariable long idCliente)   {
            
            Clientes deleteCliente = repo.findById(idCliente).get();
            repo.delete(deleteCliente);

            return "Eliminado";

      }



    

    
 
}
