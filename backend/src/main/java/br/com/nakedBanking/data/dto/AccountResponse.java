package br.com.nakedBanking.data.dto;

import lombok.Data;

@Data
public class AccountResponse {
    private String id;
    private String number;
    private String agency;
    private String cpf;
    private Boolean status;
}
