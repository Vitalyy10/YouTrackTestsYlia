package ru.youtrack.spec;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Specifications {
    public static Specifications spec;
    static final AllureRestAssured allureFilter = new AllureRestAssured()
            .setRequestTemplate("http-request.ftl")
            .setResponseTemplate("http-response.ftl");


    protected RequestSpecBuilder requestBuilder() {

        var requestBuilder = new RequestSpecBuilder();
        Set<String> blacklistHeader = new HashSet<>();
        blacklistHeader.add("Authorization");

        requestBuilder.setBaseUri("http://testYourTrack2:8080");
//        requestBuilder.setBaseUri("http://localhost:8081/api");
        // Временно включаю лоигрование токена
        requestBuilder.addFilter(new RequestLoggingFilter(LogDetail.ALL, true, System.out, false, blacklistHeader));
        requestBuilder.addFilter(new ResponseLoggingFilter());
        // Добавляем логирование в отчёт (будут в виде аттачей)
        requestBuilder.addFilter(allureFilter);


        requestBuilder.setAccept(ContentType.JSON.withCharset(StandardCharsets.UTF_8));
        requestBuilder.setContentType(ContentType.JSON.withCharset(StandardCharsets.UTF_8));
        requestBuilder.addHeader("accept", "*/*");


        return requestBuilder;
    }

    public RequestSpecification getCurrentEnvSpec() {

//        var tokenValue = authRequest.getCurrentEnvJWTToken();

        var requestBuilder = requestBuilder();
        requestBuilder.setRelaxedHTTPSValidation();

        requestBuilder.addHeader("Authorization", "Bearer " + "perm-YWRtaW4=.NDEtMA==.4BrNFi1XeoV1Pmuyw45iewkoo7KvvW");



        return requestBuilder.build();


    }


}
