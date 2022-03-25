package uz.pj.simple_trello.entity.base;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.config.security.UserDetails;

import java.util.Optional;

@Component
public class AuditAwareImpl implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(principal.getId());
    }

    public UserDetails getCredentials(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
