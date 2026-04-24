package cl.duocuc.hospitalVM.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "atenciones")
@AllArgsConstructor
@NoArgsConstructor
public class Atencion 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atencion", length = 10)
    private Long id;

    @Column(nullable = false, name = "fecha_atencion")
    private LocalDate fechaAtencion;
    
    @Column(nullable = false, name = "hora_atencion")
    private LocalTime horaAtencion;

    @Column(nullable = false)
    private Long costo;
    
    @Column(nullable = false)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Long idPaciente;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Long id_medico;

}
