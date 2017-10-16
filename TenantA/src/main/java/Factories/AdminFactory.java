package Factories;

import Domain.Admin;

import javax.crypto.KeyGenerator;

/**
 *
 */
public class AdminFactory {

    public static class AdminFactory {
        public static Admin buildCountry(String AdminId){
            Admin admin;
            admin = new Admin.Builder()
                   // .id(KeyGenerator.getEntityId())
                    .AdminId(AdminId)
                    .build();
            return admin;
        }
    }

}
