package automatizacion.automatizacion.core.linea_investigacion;

import jakarta.persistence.ManyToOne;

import automatizacion.automatizacion.core.programa.Programa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Investigacion {
    // atributos delimitador de acceso, tipo de datos, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String codigo;

    @ManyToOne
    private Programa programa;
}
