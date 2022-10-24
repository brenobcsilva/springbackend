package br.com.devdojo.demo3.examgenerator.persistence.repository;

import br.com.devdojo.demo3.examgenerator.persistence.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}
