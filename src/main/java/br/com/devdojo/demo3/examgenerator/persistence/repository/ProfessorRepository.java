package br.com.devdojo.demo3.examgenerator.persistence.repository;

import br.com.devdojo.demo3.examgenerator.persistence.model.Professor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProfessorRepository extends PagingAndSortingRepository<Professor, Long> {

    Professor findByEmail(String email);

}
