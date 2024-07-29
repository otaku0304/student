package com.example.demo.DTO;

import lombok.*;

@Getter
@Setter

public class HttpResponseDTO {
    private int responseCode;
    private String token;
    private String responseMessage;
    private Object responseBody;
}

