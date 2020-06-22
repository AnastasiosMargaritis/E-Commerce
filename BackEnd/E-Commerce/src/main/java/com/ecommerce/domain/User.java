package com.ecommerce.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    private String email;
    private String phone;

    private boolean enabled = true;

    @Enumerated(value = EnumType.STRING)
    private UserRole userRoles;

}
