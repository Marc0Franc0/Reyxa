package com.reyxa.backend.service.opiniones;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.reyxa.backend.model.opiniones.DescripcionOpinion;
import com.reyxa.backend.model.opiniones.Opinion;
import com.reyxa.backend.repository.opiniones.DescOpinionRepository;
import com.reyxa.backend.repository.opiniones.OpinionRepository;

@Service
public class OpinionServiceImp implements OpinionService {

    @Autowired
    private OpinionRepository opinionRepository;
    @Autowired
    private DescOpinionRepository descopinionRepository;


    Opinion opinion= new Opinion() ;
    DescripcionOpinion descOpinion = new DescripcionOpinion() ;
    
    
   
@Override
@Query(value = "SELECT * FROM registros WHERE NombreCliente like :nombreabuscar", nativeQuery = true)
    public void modificarOpinion(@Param("nombrebuscar") String usuario){   }; 

    @Override
    public List<Opinion> listaOpiniones() {
        // TODO Auto-generated method stub
        return opinionRepository.findAll();
    }

    @Override
    public Opinion getopinion(@PathVariable int id) {
        // TODO Auto-generated method stub
        return opinionRepository.getReferenceById(id);
    }
    
@Override
    public DescripcionOpinion nuevadesc(
        String descripcion) {
    

            descOpinion.setDescripcion(descripcion);
      descOpinion.setId_descripcion(hashCode());
        return descopinionRepository.save(descOpinion);
      }
    

    @Override
    public Opinion nuevaOpinion ( String usuario, String descripcion){
    opinion.setId_opinion(hashCode());
        opinion.setUsuario(usuario);
        opinion.setId_descripcion(nuevadesc(descripcion));
        return opinionRepository.save(opinion);
    }

    @Override
    public void borrarOpinion(  @PathVariable int id) {
        
        

    borrardesc(  opinionRepository.getReferenceById(id).getId_descripcion().getId_descripcion());
    opinionRepository.deleteById(id);
    }

    @Override
    public void borrardesc(  int id) {
      
    descopinionRepository.deleteById(id);
    }


    @Override
    public void modificarDesc(String usuario) {
        // TODO Auto-generated method stub
        
    }




 }


/*@PostMapping(path ="/add") // Map ONLY POST Requests
public String addNewUser(  @RequestParam String username, String email, String password) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Usuarios n = new Usuarios();


    n.setUsername(username);
    n.setEmail(email);
    n.setPassword(password);
    
    usuariosRepository.save(n);
    return "Gurdado";
}*/