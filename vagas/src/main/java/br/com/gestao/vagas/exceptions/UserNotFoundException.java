package br.com.gestao.vagas.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super("Usuario not found");
    }
}
