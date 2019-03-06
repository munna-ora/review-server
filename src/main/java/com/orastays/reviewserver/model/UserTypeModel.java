/**
 * @author Abhideep
 */
package com.orastays.reviewserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class UserTypeModel extends CommonModel {

	
	@JsonProperty("userTypeId")
	private String userTypeId;
	
	@JsonProperty("userType")
	private String userType;
}
