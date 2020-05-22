package com.test.automation.ApiAutomation.responsepojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatePersonResponse {

	@SerializedName("response")
	@Expose
	private List<Response> response = null;

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

}