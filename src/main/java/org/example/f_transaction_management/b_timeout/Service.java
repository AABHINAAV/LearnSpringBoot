package org.example.f_transaction_management.b_timeout;

import org.springframework.transaction.annotation.Transactional;

public class Service {
    @Transactional(timeout = 60)
    public void methodName() {
    }
}
