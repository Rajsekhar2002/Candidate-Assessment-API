package com.assessment.dto;

import java.util.Map;
import lombok.Data;

@Data
public class SubmitDTO {
    private Map<Long,String> answers;
}
