package automatizacion.automatizacion.core.documento_proyecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    // atributos: delimitador de acceso, tipo de datos, nombre del atributo
    @Autowired
    private ProyectoRepository proyectoRepository;

    // crud

    // crear
    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    public Proyecto save(Proyecto entity) {
        return proyectoRepository.save(entity);
    }

    // Read
    public Proyecto findById(long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        proyectoRepository.deleteById(id);
    }
    public List<Proyecto> findAll(){
        return proyectoRepository.findAll();
    }
}