package br.com.gestao.vagas.modules.company.entities;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "[email] formato inválido")
    private String email;
    @Length(min = 10, max = 100, message = "[password] deve ter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String address;
    private String phone;
    private String cnpj;
    private String website;
    private LocalDate createdAt;
    
}
