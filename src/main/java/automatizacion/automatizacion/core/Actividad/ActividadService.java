package automatizacion.automatizacion.core.Actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {
    // atributos: delimitador de acceso, tipo de datos, nombre del atributo
    @Autowired
    private ActividadRepository actividadRepository;

    // crud

    // crear
    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    public Actividad save(Actividad entity) {
        return actividadRepository.save(entity);
    }

    // Read
    public Actividad findById(long id) {
        return actividadRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        actividadRepository.deleteById(id);
    }
    public List<Actividad> findAll(){
        return actividadRepository.findAll();
    }
}