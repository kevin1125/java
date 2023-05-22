package automatizacion.automatizacion.core.documento_proyecto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProyectoRepository extends CrudRepository <Proyecto,Long >{
    List<Proyecto> findAll();

}
