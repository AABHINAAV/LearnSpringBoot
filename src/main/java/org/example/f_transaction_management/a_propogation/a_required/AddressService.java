package org.example.f_transaction_management.a_propogation.a_required;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveAddress() {
        // Save address to database
    }
}
