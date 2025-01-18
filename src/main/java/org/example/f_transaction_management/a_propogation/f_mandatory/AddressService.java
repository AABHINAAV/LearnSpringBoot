package org.example.f_transaction_management.a_propogation.f_mandatory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.MANDATORY)
    public void saveAddress() {
        // Save address to database
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void saveAnotherAddress() {}
    // will throw exception as parent not create transaction
}
