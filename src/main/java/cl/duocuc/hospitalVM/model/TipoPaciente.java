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

@Entity
@Table(name = "tipos_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoPaciente 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10, name = "id_tipo_paciente")
    private Long id;

    @Column(nullable = false, length = 40, name = "nombre_tipo")
    private String nombreTipo;
}
