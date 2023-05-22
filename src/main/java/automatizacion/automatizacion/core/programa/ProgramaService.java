package automatizacion.automatizacion.core.programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {
    // atributos: delimitador de acceso, tipo de datos, nombre del atributo
    @Autowired
    private ProgramaRepository programaRepository;

    // crud

    // crear
    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    public Programa save(Programa entity) {
        return programaRepository.save(entity);
    }

    // Read
    public Programa findById(long id) {
        return programaRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        programaRepository.deleteById(id);
    }
    public List<Programa> findAll(){
        return programaRepository.findAll();
    }
}