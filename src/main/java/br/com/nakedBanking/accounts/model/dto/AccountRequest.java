package br.com.nakedBanking.accounts.model.dto;

import javax.validation.constraints.NotBlank;

public class AccountRequest {

    @NotBlank
    private String number;
    @NotBlank
    private String agency;
    @NotBlank
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
