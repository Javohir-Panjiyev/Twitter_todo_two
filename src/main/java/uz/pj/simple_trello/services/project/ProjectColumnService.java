package uz.pj.simple_trello.services.project;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.project.ProjectColumnCreateDto;
import uz.pj.simple_trello.dto.project.ProjectColumnDto;
import uz.pj.simple_trello.dto.project.ProjectColumnUpdateDto;
import uz.pj.simple_trello.services.base.GenericCrudService;


public interface ProjectColumnService extends GenericCrudService<
        ProjectColumnDto,
        ProjectColumnCreateDto,
        ProjectColumnUpdateDto,
        GenericCriteria,
        Long
        > {
}
