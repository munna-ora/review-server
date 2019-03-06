package com.orastays.reviewserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class BookingVsRatingModel extends CommonModel {

	@JsonProperty("bookingRatingId")
	private String bookingRatingId;
	
	@JsonProperty("rating")
	private String rating;
	
	@JsonProperty("ratings")
	private RatingModel ratingModel;
	
	@JsonProperty("userReview")
	private UserReviewModel userReviewModel;
}
