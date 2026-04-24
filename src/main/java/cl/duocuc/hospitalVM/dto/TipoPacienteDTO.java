package cl.duocuc.hospitalVM.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TipoPacienteDTO 
{
    @NotBlank
    @Size(min = 3,max=40)
    private String nombreTipo;
}
