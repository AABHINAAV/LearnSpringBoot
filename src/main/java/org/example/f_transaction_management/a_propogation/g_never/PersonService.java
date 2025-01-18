package org.example.f_transaction_management.a_propogation.g_never;

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
        addressService.saveAddress(); // will get exception from here

        // code for adding person
    }

    public void addAnotherPerson() {
        // code for adding address of person
        addressService.saveAddress();

        // code for adding person
    }
}
