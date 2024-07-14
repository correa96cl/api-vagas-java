package br.com.gestao.vagas.modules.candidate.usecases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestao.vagas.exceptions.JobNotFoundException;
import br.com.gestao.vagas.exceptions.UserNotFoundException;
import br.com.gestao.vagas.modules.candidate.CandidateRepository;
import br.com.gestao.vagas.modules.candidate.repository.ApplyJobRepository;
import br.com.gestao.vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyJobRepository applyJobRepository;

    public void execute(UUID idCandidate, UUID idJob) {
        this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
            throw new UserNotFoundException();
        });

        this.jobRepository.findById(idJob)
        .orElseThrow(() -> {
            throw new JobNotFoundException();
        });

    }
    
}
