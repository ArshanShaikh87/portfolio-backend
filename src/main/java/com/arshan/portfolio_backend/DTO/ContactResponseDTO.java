package com.arshan.portfolio_backend.DTO;

import lombok.Data;

@Data
public class ContactResponseDTO {

    private String successMsg;

    public ContactResponseDTO(String successMsg) {
        this.successMsg = successMsg;
    }
}
