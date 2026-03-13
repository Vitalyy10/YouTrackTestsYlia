package ru.youtrack.api.issues;

import org.junit.jupiter.api.Test;
import ru.youtrack.api.BaseApiTest;
import ru.youtrack.models.issues.Issue;
import ru.youtrack.models.issues.Project;
import ru.youtrack.requests.unchecked.UncheckedIssue;
import ru.youtrack.spec.Specifications;

public class IssueTests extends BaseApiTest {


    @Test
    public void createIssue(){
        var spec = new UncheckedIssue(new Specifications().getCurrentEnvSpec());
        spec.create(Issue.builder()
                        .description("TestDescription")
                        .summary("TestSummary")
                        .project(Project.builder()
                                .id("0-1")
                                .build())
                .build());

    }
}
