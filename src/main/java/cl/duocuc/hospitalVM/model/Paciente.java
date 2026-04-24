package cl.duocuc.hospitalVM.model;
 

import java.time.LocalDate;

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
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_paciente;

    @Column(nullable = false, unique = true)
    private int run;

    @Column(nullable = false)
    private String pnombre;

    @Column(nullable = true)
    private String snombre;

    @Column(nullable = false)
    private String apaterno;

    @Column(nullable = false)
    private String amaterno;

    @Column(nullable= false)
    private LocalDate fecha_nacimiento;

    @Column(nullable = true)
    private String correo;
}
