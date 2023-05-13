package com.abidkiller.com.erp.controller;

import com.abidkiller.com.erp.dto.response.QueryResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Abid
 */
@RestController
@RequestMapping(
        value = {"/api/v1/session"},
        produces = {MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE}

)
public class SessionController {

    @GetMapping(
            value = {"/test"}
    )
    public ResponseEntity<QueryResponse<String>> test(){

        return ResponseEntity.ok( new QueryResponse ("hello",null));

    }

}
