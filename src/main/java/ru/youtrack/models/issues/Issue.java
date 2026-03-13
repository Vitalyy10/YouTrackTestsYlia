package ru.youtrack.models.issues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Issue {
    private String summary;
    private String description;
    private Project project;
}
