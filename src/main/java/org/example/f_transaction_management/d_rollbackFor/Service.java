package org.example.f_transaction_management.d_rollbackFor;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public class Service {
    @Transactional(rollbackFor = {IOException.class, DataAccessException.class})
    public void methodName() throws Exception {
        throw new IOException();
    }
}
