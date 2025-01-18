package org.example.f_transaction_management.a_propogation.g_never;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.NEVER)
    public void saveAddress() {
        // will throw exception as parent not create transaction
    }

    @Transactional(propagation = Propagation.NEVER)
    public void saveAnotherAddress() {
        // Save address to database
    }
}
