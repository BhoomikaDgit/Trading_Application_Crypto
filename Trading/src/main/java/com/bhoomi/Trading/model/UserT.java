package com.bhoomi.Trading.model;

import com.bhoomi.Trading.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data //provides getter setter method for entity class
public class UserT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    //two factor auth
    @Embedded
private TwoFactorAuth twoFactorAuth=new TwoFactorAuth();
    private USER_ROLE role= USER_ROLE.ROLE_CUSTOMER;

}
