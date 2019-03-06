package com.orastays.reviewserver.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.orastays.reviewserver.helper.MessageUtil;

public class CommonConverter {

	@Autowired
	protected ModelMapper modelMapper;

	@Autowired
	protected RestTemplate restTemplate;

	@Autowired
	protected MessageUtil messageUtil;
	
	@Autowired
	protected BookingVsRatingConverter bookingVsRatingConverter;
	
	@Autowired
	protected RatingConverter ratingConverter;
}
