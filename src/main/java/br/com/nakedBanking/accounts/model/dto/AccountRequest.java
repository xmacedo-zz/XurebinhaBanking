package br.com.nakedBanking.accounts.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AccountRequest {

    @NotBlank
    @Pattern(regexp="[0-9]+", message = "just enter numbers")
    @Size(min = 6, max = 6, message = "numero must be 6 digits")
    private String number;

    @NotBlank
    @Pattern(regexp="[0-9]+", message = "just enter numbers")
    @Size(min = 4, max = 4, message = "agencia must be 4 digits")
    private String agency;

    @NotBlank
    @Pattern(regexp="[0-9]+", message = "just enter numbers")
    @Size(min = 11, max = 11, message = "cpf must be 11 digits")
    private String cpf;
    private Boolean status;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
