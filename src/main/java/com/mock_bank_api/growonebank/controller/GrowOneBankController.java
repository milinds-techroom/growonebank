package com.mock_bank_api.growonebank.controller;

import com.mock_bank_api.growonebank.dto.EligibilityRequest;
import com.mock_bank_api.growonebank.dto.EligibilityResponse;
import com.mock_bank_api.growonebank.service.GrowOneBankService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("growonebank/api/v1")
public class GrowOneBankController {

    private  final GrowOneBankService growOneBankService;

    public GrowOneBankController(GrowOneBankService growOneBankService) {
        this.growOneBankService = growOneBankService;
    }

    @PostMapping("/check-eligibility")
    public ResponseEntity<?> checkEligibility(@RequestBody EligibilityRequest eligibilityRequest){
        System.out.println("called Bank API");
        EligibilityResponse response= growOneBankService.checkEligibility(eligibilityRequest);
        return  ResponseEntity.ok(response);
    }
}
