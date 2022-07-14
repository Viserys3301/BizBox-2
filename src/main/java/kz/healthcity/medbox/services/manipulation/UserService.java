package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.dto.security.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDTO userDTO);
}
