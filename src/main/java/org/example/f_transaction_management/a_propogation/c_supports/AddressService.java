package org.example.f_transaction_management.a_propogation.c_supports;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public void saveAddress() {
        // Save address to database
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void saveAnotherAddress() {}
}
