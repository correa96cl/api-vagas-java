package br.com.gestao.vagas.modules.candidate.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

    Optional<CandidateEntity> findByEmail(String email);

    Optional<CandidateEntity> findByUsername(String username);

    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);    
}
