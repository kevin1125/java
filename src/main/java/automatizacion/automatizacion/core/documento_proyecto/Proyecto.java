package automatizacion.automatizacion.core.documento_proyecto;
import jakarta.persistence.ManyToOne;
import automatizacion.automatizacion.core.Actividad.Actividad;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Proyecto {
    //atributos delimitador de acceso, tipo de datos, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String justificacion;
    private String antecedente;

    @ManyToOne
    private Actividad actividad;
}