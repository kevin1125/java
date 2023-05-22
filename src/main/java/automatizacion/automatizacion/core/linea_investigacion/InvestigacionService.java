package automatizacion.automatizacion.core.linea_investigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestigacionService {
    // atributos: delimitador de acceso, tipo de datos, nombre del atributo
    @Autowired
    private InvestigacionRepository investigacionRepository;

    // crud

    // crear
    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    public Investigacion save(Investigacion entity) {
        return investigacionRepository.save(entity);
    }

    // Read
    public Investigacion findById(long id) {
        return investigacionRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        investigacionRepository.deleteById(id);
    }
    public List<Investigacion> findAll(){
        return investigacionRepository.findAll();
    }
}