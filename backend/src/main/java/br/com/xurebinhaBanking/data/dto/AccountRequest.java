package br.com.xurebinhaBanking.data.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class AccountRequest {

    @NotBlank
    @Pattern(regexp = "[0-9]+", message = "just enter numbers")
    @Size(min = 6, max = 6, message = "numero must be 6 digits")
    private String number;

    @NotBlank
    @NotBlank
    @Pattern(regexp = "[0-9]+", message = "just enter numbers")
    @Size(min = 4, max = 4, message = "agencia must be 4 digits")
    private String agency;

    @NotBlank
    @NotBlank
    @Pattern(regexp = "[0-9]+", message = "just enter numbers")
    @Size(min = 11, max = 11, message = "cpf must be 11 digits")
    private String cpf;
    private Boolean status;
}
