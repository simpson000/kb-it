package org.scoula.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordDTO {
    String username;//사용자 id
    String oldPassword; // 사용자 이전 비밀번호
    String newPassword; //사용자 새 비밀번호
}
