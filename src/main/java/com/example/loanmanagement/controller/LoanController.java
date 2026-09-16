package com.example.loanmanagement.controller;

import com.example.loanmanagement.exception.ValidationException;
import com.example.loanmanagement.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<String> applyForLoan(@RequestBody String loanRequest) throws ValidationException {
        loanService.processLoanApplication(loanRequest);
        return ResponseEntity.ok("Loan application processed");
    }
}