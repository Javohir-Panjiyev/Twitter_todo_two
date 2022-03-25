package uz.pj.simple_trello.dto.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

@Setter
@Getter
@Builder(builderMethodName = "childBuilder")
public class AuthUserUpdateDto extends GenericDto {
    private String username;
    private String email;
    private String phoneNumber;

}
