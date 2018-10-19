package com.example.cabproject.rideestimates.rideEstimatesImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.rideestimates.IRideEstimateService;

@Service
@Qualifier("olaRidesEstimatesImpl")
public class OlaRidesEstimatesImpl implements IRideEstimateService{

}
