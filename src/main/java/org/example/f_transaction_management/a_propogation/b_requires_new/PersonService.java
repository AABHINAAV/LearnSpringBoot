package org.example.f_transaction_management.a_propogation.b_requires_new;

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
}
