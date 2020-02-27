package br.com.auth.celk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * @Author Caiba
 */
@Entity
@AllArgsConstructor
@Data
public class User extends BaseEntity{

    @NotNull(message = "The field 'user' is mandatory")
    @Column(nullable = false)
    private String username;
    @NotNull(message = "The field 'password' is mandatory")
    @Column(nullable = false)
    @ToString.Exclude
    private String password;

    //TODO melhorar a implementacao de roles e permitions
//    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy = "user")
//    private List<Role> roles;

}
