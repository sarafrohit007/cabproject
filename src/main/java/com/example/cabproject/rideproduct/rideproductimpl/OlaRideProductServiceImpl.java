package com.example.cabproject.rideproduct.rideproductimpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.rideproduct.IRideProductsService;

@Service
@Qualifier("olaRideProductServiceImpl")
public class OlaRideProductServiceImpl implements IRideProductsService{

}
