package cl.duocuc.hospitalVM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "medicos")
@AllArgsConstructor
@NoArgsConstructor
public class Medico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico", length = 10)
    private Long id;

    @Column(nullable = false, length = 8)
    private Long run;

    @Column(nullable = false)
    private char dv;

    @Column(nullable = false, length = 50)
    private String pnombre;

    @Column(nullable = true, length = 50)
    private String snombre;

    @Column(nullable = false, length = 50)
    private String apaterno;

    @Column(nullable = false, length = 50)
    private String amaterno;
    
    @Column(nullable = false)
    private Especialidad especialidad;

    @Column(nullable = false, name = "jefe_turno")
    private char jefeTurno;

    enum Especialidad {
        PEDIATRIA,
        GENERAL,
        ONCOLOGIA,
        CIRUJANO,
        OFTAMOLOGIA,
        OTORRINOLARINGOLOGIA
    }

}
