package ru.youtrack.requests.unchecked;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import ru.youtrack.models.issues.Issue;
import ru.youtrack.requests.BaseRequest;
import ru.youtrack.requests.CrudInterface;

import static io.restassured.RestAssured.given;

public class UncheckedIssue extends BaseRequest  {

    private static final String ISSUE_EDPOINT = "/issues";
    public UncheckedIssue(RequestSpecification spec) {
        super(spec);
    }


    public ValidatableResponse create(Issue issue) {
        return given()
                .spec(spec)
                .body(issue)
                .post(ISSUE_EDPOINT)
                .then().assertThat().statusCode(HttpStatus.SC_OK);
    }


    public Issue get(Long l) {
        return null;
    }


    public Issue update(Issue obj) {
        return null;
    }

    public void delete(Long l) {

    }
}
