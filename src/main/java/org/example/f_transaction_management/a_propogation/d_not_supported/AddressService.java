package org.example.f_transaction_management.a_propogation.d_not_supported;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void saveAddress() {
        // will throw exception as parent not create transaction
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void saveAnotherAddress() {
        // suppose throwing exception
    }
}
