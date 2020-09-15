package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.constants.AppConstants;
import com.example.model.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 200, message = AppConstants.MSG_SUCCESS),
        @ApiResponse(code = 400, message = AppConstants.MSG_BAD_REQUEST),
        @ApiResponse(code = 401, message = AppConstants.MSG_UNAUTHORIZED),
        @ApiResponse(code = 403, message = AppConstants.MSG_FORBIDDEN),
        @ApiResponse(code = 404, message = AppConstants.MSG_NOT_FOUND),
        @ApiResponse(code = 406, message = AppConstants.MSG_NOT_ACCEPTABLE),
        @ApiResponse(code = 500, message = AppConstants.MSG_INTERNAL_SERVER_ERROR),
})
@RequestMapping("/api")
public class TestController {

    @ApiOperation(value="Hello World",
                  produces = MediaType.APPLICATION_JSON_VALUE,
                  httpMethod = AppConstants.HTTP_METHOD_GET)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }

    @ApiOperation(value="Get User Details",
                  produces = MediaType.APPLICATION_JSON_VALUE,
                  httpMethod = AppConstants.HTTP_METHOD_GET)
    @GetMapping(value = "/user")
    public ResponseEntity<User> getUser(){
        User user = new User("Prats", "Paruchuri", "Ashburn", "female");
        ResponseEntity response = new ResponseEntity(user, HttpStatus.OK);
        return response;
    }

}
