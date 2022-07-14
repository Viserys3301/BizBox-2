package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.controllers.manipulation.MedBoxUser;
import kz.healthcity.medbox.controllers.security.Role;
import kz.healthcity.medbox.dto.security.UserDTO;
import kz.healthcity.medbox.repositories.manipulation.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceIml implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserServiceIml(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public boolean save(UserDTO userDTO) {
        if(!Objects.equals(userDTO.getPassword(),userDTO.getMatchingPassword())){
            throw new RuntimeException("password not =");
        }
        MedBoxUser user = MedBoxUser.builder()
                .name(userDTO.getUsername())
                .password(passwordEncoder.encode(userDTO.getPassword()))
                .role(Role.ADMIN)
                .build();
        userRepository.save(user);
        return true;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MedBoxUser user = userRepository.findFirstByName(username);
        if(user==null){
            throw new  UsernameNotFoundException("Not found");
        }

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().name()));
        return new User(user.getName(),user.getPassword(),roles);

    }
}
