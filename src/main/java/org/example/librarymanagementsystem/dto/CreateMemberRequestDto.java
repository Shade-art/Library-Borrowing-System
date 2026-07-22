package org.example.librarymanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMemberRequestDto {

        @NotBlank
        private String fullName;

        @NotBlank
        @Email
        private String email;

        private String phoneNumber;


}
