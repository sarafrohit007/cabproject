package com.example.cabproject.riderequests.rideRequsetImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.riderequests.IRidesRequestService;

@Service
@Qualifier("uberRideRequestsImpl")
public class UberRideRequestsImpl implements IRidesRequestService{

}
