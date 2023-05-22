package automatizacion.automatizacion.core.linea_investigacion;

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
@RequestMapping("api/investigacion")
@CrossOrigin({ " * " })
public class InvestigacionController {
    @Autowired
    private InvestigacionService investigacionService;

    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public Investigacion save(@RequestBody Investigacion entity) {
        return investigacionService.save(entity);
    }

    // read
    @GetMapping("/{id}/")
    public Investigacion findById(@PathVariable long id) {
        return investigacionService.findById(id);
    }
    @GetMapping("/")

    public List<Investigacion> findAll() {
        return investigacionService.findAll();
    }


    @PutMapping("/")
    public Investigacion update( @RequestBody Investigacion entity) {
       return investigacionService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        investigacionService.deleteById(id);

    }

}