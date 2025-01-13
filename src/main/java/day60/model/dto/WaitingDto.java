package day60.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class WaitingDto {
    private int wno;
    private String wphone;
    private int wpeople;
}
