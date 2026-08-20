package com.mock_bank_api.growonebank.service;

import com.mock_bank_api.growonebank.dto.EligibilityRequest;
import com.mock_bank_api.growonebank.dto.EligibilityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class GrowOneBankServiceImpl implements GrowOneBankService{


    @Override
    public EligibilityResponse checkEligibility(EligibilityRequest eligibilityRequest) {
        boolean eligible = eligibilityRequest.getMonthlyIncome()
                .compareTo(new BigDecimal("25000")) >= 0;

        BigDecimal approvedAmount = eligible
                ? eligibilityRequest.getLoanRequired()
                : BigDecimal.ZERO;

        return new EligibilityResponse(
                eligibilityRequest.getInquiryId(),
                "GROWONE-" + UUID.randomUUID(),
                eligible,
                approvedAmount,
                new BigDecimal("8.50"),
                eligibilityRequest.getTenureYears(),
                new BigDecimal((long)(Math.random() * 5000) + 1),
                "GrowOne Bank"
        );
    }
}
