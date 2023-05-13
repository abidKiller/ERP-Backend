package com.abidkiller.com.erp.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Abid
 */
@Data
public class Message {
    @JsonProperty("message") private String message;
    @JsonProperty("heading") private String heading;

}
