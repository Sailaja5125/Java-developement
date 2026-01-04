package com.example.JobPortalBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

// using llombok to avoid creating all getters and setters
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
