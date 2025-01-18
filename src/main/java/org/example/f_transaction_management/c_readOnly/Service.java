package org.example.f_transaction_management.c_readOnly;

import org.springframework.transaction.annotation.Transactional;

public class Service {
    @Transactional(readOnly = true)
    public void methodName() {
    }
}
