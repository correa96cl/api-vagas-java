package br.com.gestao.vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestao.vagas.exceptions.UserFoundException;
import br.com.gestao.vagas.modules.candidate.controllers.CandidateEntity;
import br.com.gestao.vagas.modules.candidate.controllers.CandidateRepository;

@Service
public class CreateCandidateUseCase {

        @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
       this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent(
            (user) -> {
                throw new UserFoundException();
            }
        );

        return this.candidateRepository.save(candidateEntity);
    }
    
}
