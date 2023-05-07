package org._99co.userservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.RequestParam;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagingRequest {
    private Integer page_num = 1;
    @JsonProperty("page_size")
    private Integer page_size = 10;
}
