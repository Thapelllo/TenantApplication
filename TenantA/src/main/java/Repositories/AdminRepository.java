package Repositories;

import Domain.Admin;

public class AdminRepository {


    public interface AdminRepository extends CrudRepository<Admin, String> {
    }
}

public interface CountryRepository extends CrudRepository<Country, String> {
}