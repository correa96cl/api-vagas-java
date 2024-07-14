package br.com.gestao.vagas.exceptions;

public class JobNotFoundException extends RuntimeException {

    public JobNotFoundException(){
        super("Job not found");
    }
    
}
