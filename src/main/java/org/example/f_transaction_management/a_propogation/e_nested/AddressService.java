package org.example.f_transaction_management.a_propogation.e_nested;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.NESTED)
    public void saveAddress() {
        // Save address to database
    }
}
