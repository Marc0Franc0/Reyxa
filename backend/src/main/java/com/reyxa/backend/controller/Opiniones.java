package com.reyxa.backend.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Asistente;
import com.reyxa.backend.model.opiniones.Opinion;
import com.reyxa.backend.repository.opiniones.DescOpinionRepository;
import com.reyxa.backend.repository.opiniones.OpinionRepository;



@RestController

public class Opiniones extends Asistente {
    @Autowired
OpinionRepository repository;
@Autowired
DescOpinionRepository repository2;
Opinion opinion = new Opinion();
    /*@GetMapping("/opiniones")
    public void listaOpiniones(){
      String Usuario = opinionService.getopinion(1).getUsuario();
      String descripcion = opinionService.getopinion(1).getId_descripcion().getDescripcion();
      System.out.println("Usuario: "+Usuario +"/n"+"Opinion: "+descripcion);
    }*/

   @GetMapping("/opiniones")
    public List<Opinion> listaOpiniones(){
      
     return repository.findAll();
    }
    @PostMapping(path = "/nuevaopinion")
    public String nuevaOpinion( @RequestParam String usuario, @RequestParam String descripcion) {
  
   opinionService.nuevaOpinion(usuario, descripcion);
      return "guardada";
    }
    @GetMapping(path = "/buscaropinion")
    public String buscaropinion( @RequestParam String usuario) {
   
       if(opinionService.existsByUsuario(usuario)){
          opinion = this.opinionService.findByUsuario(usuario);
          return "Opinion encontrada: "+ opinion.getId_descripcion().getDescripcion();
    //return "Ya hay una opinion de este usuario";
   
       }else{
            return "No se encontro una opinion de ese usuario";  
       }
   
    }
    /*@DeleteMapping(path = "borraropinion")
  public void borrarOpinion( @RequestParam  int id) {

   opinionService.borrarOpinionbyid(id);
  }
*/

   /*  @PutMapping(path = "cambiaropinion")
   public void modificarOpinion( @RequestParam String usuario) {


  }*/
  


    /*public DescripcionOpinion adddescripcion(
      String descripcion) {
  
      DescripcionOpinion agregar = new DescripcionOpinion();
      agregar.setDescripcion(descripcion);
    
      return repository2.save(agregar);
    }*/
  
    /*@PostMapping(path = "/agregarOP")
    public String addOpinion(@RequestParam int id_opinion,
        @RequestParam String usuario, @RequestParam int id_descripcion, @RequestParam String descripcion) {
  
    Opinion agregar = new Opinion();
      agregar.setUsuario(usuario);
      agregar.setId_descripcion(adddescripcion(id_descripcion, descripcion));
    
      repository.save(agregar);
      return "Opinion guardada";
    }*/
   

    
}
