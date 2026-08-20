package com.mock_bank_api.growonebank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EligibilityRequest {

    private String inquiryId;
    private BigDecimal monthlyIncome;
    private String employmentType;
    private BigDecimal propertyValue;
    private BigDecimal loanRequired;
    private Integer tenureYears;
    private String propertyLocation;

}
