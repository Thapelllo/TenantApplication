package Repositories;

import Domain.Admin;

import org.springframework.data.repositories.CrudRepository;
import org.springframework.stereotype.Repositories;


//@Repositories
public interface AdminRepository extends CrudRepository<Admin,Long> {
}

