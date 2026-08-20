package com.mock_bank_api.growonebank.service;

import com.mock_bank_api.growonebank.dto.EligibilityRequest;
import com.mock_bank_api.growonebank.dto.EligibilityResponse;

public interface GrowOneBankService {

    public EligibilityResponse checkEligibility(EligibilityRequest eligibilityRequest);
}
