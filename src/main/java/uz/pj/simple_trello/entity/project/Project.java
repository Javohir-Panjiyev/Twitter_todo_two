package uz.pj.simple_trello.entity.project;

import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.entity.base.Auditable;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "project")
public class Project extends Auditable {

    @Column(name = "name", nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String tz;
    private Long organizationId;

    @Column(name = "closed")
    private Boolean closed = false;

}