package com.example.duanbe.request;

import lombok.Data;

@Data
public class ResetMKRequest {
    private String token;
    private String newPassword;
}
