package ru.youtrack.requests;

import io.restassured.specification.RequestSpecification;

public class BaseRequest {
    protected final RequestSpecification spec;



    public BaseRequest(RequestSpecification spec){
        this.spec = spec;


    }
}
