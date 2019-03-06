/**
 * @author Abhideep
 */
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
public class UserVsTypeModel extends CommonModel {

	@JsonProperty("userVsTypeId")
	private String userVsTypeId;
	
	@JsonProperty("user")
	private UserModel user;
	
	@JsonProperty("userType")
	private UserTypeModel userType;
}
