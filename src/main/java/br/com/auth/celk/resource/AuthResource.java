package br.com.auth.celk.resource;

import br.com.auth.celk.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Caiba
 */

@RestController
@RequestMapping("/api/auth-engine/v1")
public class AuthResource {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/validate")
    public ResponseEntity<Void> validateCredencial(){
        return ResponseEntity.ok().build();
    }


}
