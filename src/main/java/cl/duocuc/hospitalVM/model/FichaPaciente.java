package cl.duocuc.hospitalVM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fichas_paciente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichaPaciente 
{
    @Id 
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @Column(nullable = false, length = 100, name="datos_paciente")
    private String datosPaciente;

    @Column(nullable = false, length = 100, name="datos_paciente1")
    private String datosPaciente1;

    @Column(nullable = false, length = 100, name="datos_paciente2")
    private String datosPaciente2;

    @Column(nullable = false, length = 100, name="datos_paciente3")
    private String datosPaciente3;

    @Column(nullable = false, length = 100, name="datos_paciente4")
    private String datosPaciente4;
}
