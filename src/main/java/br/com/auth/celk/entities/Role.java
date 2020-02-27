package br.com.auth.celk.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/***
 * @Author Caibas
 *
 */
@Entity
@Getter
@Setter
@ToString
public class Role extends BaseEntity{

    private String name;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Role(String name){
        this.name = name;
    }

}
