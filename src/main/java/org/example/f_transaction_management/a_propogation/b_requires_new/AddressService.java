package org.example.f_transaction_management.a_propogation.b_requires_new;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveAddress() {
        // Save address to database
    }
}
