package com.mapduck.serivce;

import com.mapduck.dto.MemberDto;

/**
 * 작성자: 강동연
 * 작성일시: 2021.11.03
 * 설명: UserService 인터페이스
 */
public interface UserService {

    MemberDto join(MemberDto userDto);
    MemberDto findByEmail(String email);
    MemberDto updateProfile(MemberDto userDto);
    MemberDto changePassword(MemberDto userDto);

}
