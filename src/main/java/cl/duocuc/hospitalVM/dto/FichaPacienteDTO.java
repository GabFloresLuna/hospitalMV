package cl.duocuc.hospitalVM.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FichaPacienteDTO 
{
    @NotBlank
    @Size(min = 3,max = 100)
    private String datos_paciente;

    @NotBlank
    @Size(min = 3,max = 100)
    private String datos_paciente1;

    @NotBlank
    @Size(min = 3,max = 100)
    private String datos_paciente2;

    @NotBlank
    @Size(min = 3,max = 100)
    private String datos_paciente3;

    @NotBlank
    @Size(min = 3,max = 100)
    private String datos_paciente4;
}
