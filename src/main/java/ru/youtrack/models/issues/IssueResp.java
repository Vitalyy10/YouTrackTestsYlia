package ru.youtrack.models.issues;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IssueResp {

    @JsonProperty("$type")
    private String type;
    private String id;

}
