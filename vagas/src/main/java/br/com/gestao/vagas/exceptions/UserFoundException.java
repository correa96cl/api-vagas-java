package br.com.gestao.vagas.exceptions;

public class UserFoundException extends RuntimeException {

    public UserFoundException(){
        super("Usuario ja existe");
    }
    
}
