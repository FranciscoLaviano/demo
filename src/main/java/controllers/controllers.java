package controllers;

import lombok.Getter;
import lombok.Setter;
import models.Clients;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import repository.repository;
import java.lang.String;
import org.springframework.web.bind.annotation.DeleteMapping;

@Getter
@Setter

@RestController
public class controllers {

    @Autowired
     private repository repo;

    @GetMapping
    public String index(){
      return "Connected";
   }

   @GetMapping("clients")
    public List<Clients> getId() {
        return repo.findAll();
    }


    @PostMapping("alta")
    public String post(@RequestBody Clients clients) {
        repo.save(clients);
        //TODO: process POST request
        
        return "Saved";
    }

    @PostMapping("modification/{Id}")
    @Id

      public String  update(@PathVariable Long Id, @RequestBody Clients clients) {


           Clients updateClients = repo.findById(Clients).getId();
           updateClients.setName(clients.getName());
           updateClients.setOverNames(clients.getOverNames());
           updateClients.setFirstSurname(clients.getFirstSurname());
           updateClients.setSecondSurname(clients.getSecondSurname());
           updateClients.setMail(clients.getMail());

           repo.save(updateClients);

           return "Modification";

      }   

    @DeleteMapping("baba/{Id}")
        public String delete(@PathVariable long Id)   {
            
            Clients deleteClient = repo.findById(Id).get();
            repo.delete(deleteClient);

            return "Elimination";

      }



    

    
 
}
