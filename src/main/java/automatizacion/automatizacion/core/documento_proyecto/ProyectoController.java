package automatizacion.automatizacion.core.documento_proyecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/proyecto")
@CrossOrigin({ " * " })
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public Proyecto save(@RequestBody Proyecto entity) {
        return proyectoService.save(entity);
    }

    // read
    @GetMapping("/{id}/")
    public Proyecto findById(@PathVariable long id) {
        return proyectoService.findById(id);
    }
    @GetMapping("/")

    public List<Proyecto> findAll() {
        return proyectoService.findAll();
    }


    @PutMapping("/")
    public Proyecto update( @RequestBody Proyecto entity) {
       return proyectoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        proyectoService.deleteById(id);

    }

}