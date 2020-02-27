package br.com.auth.celk.services;

import br.com.auth.celk.entities.User;
import br.com.auth.celk.repositories.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author Caibas
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @SneakyThrows
    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }

    public User loadUser(Long id) throws Exception{
        Optional<User> user = repo.findById(id);
        Optional.ofNullable(user).orElseThrow(Exception::new);
            return user.get();
    }

}
