package org.example.f_transaction_management.a_propogation.d_not_supported;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private AddressService addressService;

    @Transactional
    public void addPerson() {
        // code for adding address of person
        addressService.saveAddress();

        // code for adding person
    }

    @Transactional
    public void addAnotherPerson() {
        // code for adding address of person
        addressService.saveAddress(); // getting exception
        // roll back process
    }
}