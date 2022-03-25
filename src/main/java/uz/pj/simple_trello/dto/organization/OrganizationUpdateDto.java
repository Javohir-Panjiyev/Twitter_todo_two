package uz.pj.simple_trello.dto.organization;


import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

@Getter
@Setter
public class OrganizationUpdateDto extends GenericDto {
    private String name;
    private String code;
    private String email;


    public OrganizationUpdateDto(Long id, String name, String code, String email) {
        super(id);
        this.name = name;
        this.code = code;
        this.email = email;
    }
}
