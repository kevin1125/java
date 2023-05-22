package automatizacion.automatizacion.core.linea_investigacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InvestigacionRepository extends CrudRepository <Investigacion,Long >{
    List<Investigacion> findAll();

}
