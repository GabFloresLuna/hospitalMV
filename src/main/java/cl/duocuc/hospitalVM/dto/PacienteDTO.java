package cl.duocuc.hospitalVM.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PacienteDTO 
{
    @NotNull
    private Long numRun;
    
    @NotBlank
    @Pattern(regexp = "^[0-9kK]{1}$",message = "El dv debe ser un valor entre 0 y 9 ó K")
    private char dv;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private String pnombre;
    
    @Size(min = 3, max = 50)
    private String snombre;
    
    @NotBlank(message = "El apellido paterno no puede estar vacio")
    private String apaterno;
    
    @NotBlank(message = "El apellido materno no puede estar vacio")
    @Size(min = 3, max = 50)
    private String amaterno;
    
    @NotNull
    @Past(message = "La fecha no puede ser futura")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaNacimiento;
    
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2-6}$", message = "Formáto de correo electrónico inválido")
    private String correo;

}