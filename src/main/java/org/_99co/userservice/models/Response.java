package org._99co.userservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Response<T> {
    @JsonProperty("result")
    private Boolean result;

    @JsonProperty("data")
    private T data;

}
