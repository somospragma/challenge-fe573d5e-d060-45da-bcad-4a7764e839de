package com.example.loanmanagement.service;

import com.example.loanmanagement.exception.ServiceException;
import com.example.loanmanagement.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public void processLoanApplication(String loanRequest) throws ServiceException {
        // Simular un fallo de servicio
        throw new ServiceException("Service error");
    }
}