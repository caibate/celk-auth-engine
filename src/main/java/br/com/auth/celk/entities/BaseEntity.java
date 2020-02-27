package br.com.auth.celk.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author Caibas
 *
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}