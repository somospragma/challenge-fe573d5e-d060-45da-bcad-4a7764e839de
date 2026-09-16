package com.example.loanmanagement.repository;

import com.example.loanmanagement.exception.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class LoanRepository {

    public void saveLoan(String loan) throws DataAccessException {
        // Simular un fallo de acceso a datos
        throw new DataAccessException("Data access error");
    }
}