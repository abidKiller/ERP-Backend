package com.abidkiller.com.erp.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
/**
 * @author Abid
 */
@Data
@AllArgsConstructor
public class QueryResponse<T> {
    @JsonProperty("result") private T result;
    @JsonProperty("errorMessage") private List<Message> errorMessages;

}
