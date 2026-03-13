package ru.youtrack.requests.checked;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import ru.youtrack.models.issues.Issue;
import ru.youtrack.models.issues.IssueResp;
import ru.youtrack.requests.unchecked.UncheckedIssue;

public class CheckedIssue {

    private UncheckedIssue uncheckedIssue;

    public CheckedIssue(RequestSpecification spec) {
        this.uncheckedIssue = new UncheckedIssue(spec);
    }


    public IssueResp create(Issue issue) {
        return uncheckedIssue.create(issue)
                .extract().as(IssueResp.class);

    }
}
