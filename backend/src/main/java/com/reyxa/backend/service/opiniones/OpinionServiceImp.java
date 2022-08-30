package com.reyxa.backend.service.opiniones;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    Opinion opinion = new Opinion();
    DescripcionOpinion descOpinion = new DescripcionOpinion();

     @Override
    public List<Opinion> listaOpiniones() {
        // TODO Auto-generated method stub
        return opinionRepository.findAll();
    }

    /*@Override
    public Opinion getopinionbyid(@PathVariable int id) {
        // TODO Auto-generated method stub
        return opinionRepository.getReferenceById(id);
    }*/

    @Override
    public DescripcionOpinion nuevadesc( int id_descripcion,String descripcion) {
    descOpinion.setId_descripcion(id_descripcion);
        descOpinion.setDescripcion(descripcion);
       
       return  descopinionRepository.save(descOpinion);
    }

    @Override
    public String nuevaOpinion(Opinion opinion) {
        String rta;

        if(existsByUsuario(opinion.getUsuario())){
rta= "Ya existe una opinion de ese usuario";
        }else{
            int id = hashCode();
            opinion.setId_opinion(id);
            opinion.setUsuario(opinion.getUsuario());
            opinion.setId_descripcion(nuevadesc(opinion.getId_opinion(),opinion.getId_descripcion().getDescripcion()));
            opinionRepository.save(opinion);
                  
            rta="Opinion guardada";
        }

return rta;
    }

    /*@Override
    public void borrarOpinionbyid(@PathVariable int id) {

        borrardesc(opinionRepository.getReferenceById(id).getId_descripcion().getId_descripcion());
        opinionRepository.deleteById(id);
    }
*/
   /*  @Override
    public void borrardesc(int id) {

        descopinionRepository.deleteById(id);
    }
*/

    @Override

    public String modificarOpinion(String usuario) {


opinionRepository.modificarusuario(usuario, findByUsuario(usuario).getId_opinion());
        return "Opinion modificada";
   
}

    @Override
    public Opinion findByUsuario(String usuario) {
    
        //Optional <Opinion> opinion = this.opinionRepository.findByUsername(usuario);
     return this.opinionRepository.findByUsuario(usuario);


    }

    


  @Override
 public void modificarDesc(String usuario) {
  // TODO Auto-generated method stub
  
  }

@Override
public boolean existsByUsuario(String usuario) {
    return opinionRepository.existsByUsuario(usuario);
}

@Override
public String eliminarOpinion(String usuario) {
    descopinionRepository.eliminaropinion(findByUsuario(usuario).getId_descripcion().getId_descripcion());
opinionRepository.eliminaropinion(usuario);

    return "Opinion del usuario "+usuario+" eliminada";
}
 

}

/*
 * @PostMapping(path ="/add") // Map ONLY POST Requests
 * public String addNewUser( @RequestParam String username, String email, String
 * password) {
 * // @ResponseBody means the returned String is the response, not a view name
 * // @RequestParam means it is a parameter from the GET or POST request
 * 
 * Usuarios n = new Usuarios();
 * 
 * 
 * n.setUsername(username);
 * n.setEmail(email);
 * n.setPassword(password);
 * 
 * usuariosRepository.save(n);
 * return "Gurdado";
 * }
 */