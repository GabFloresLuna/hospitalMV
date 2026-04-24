package cl.duocuc.hospitalVM.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public class AtencionDTO 
{
    @NotNull
    @Past(message = "La fecha no puede ser futura")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaAtencion;

    @NotNull
    private LocalTime horaAtencion;

    
}
