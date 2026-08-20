package com.mock_bank_api.growonebank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EligibilityResponse {

    private String inquiryId;
    private String bankReferenceId;
    private boolean eligible;
    private BigDecimal approvedAmount;
    private BigDecimal interestRate;
    private Integer tenureYears;
    private BigDecimal processingFee;
    private String bankName;
}
