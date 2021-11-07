package com.mapduck.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * 작성자: 강동연
 * 작성일: 2021.11.3
 * 설명: MemberDto
 *
 * 수정일 : 2021.11.07
 * 수정사항: UserDto -> MemberDto
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) // camelCase to snake
public class MemberDto {

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String phone;

}
