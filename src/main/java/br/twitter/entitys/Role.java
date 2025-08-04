package br.twitter.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "tb_roles")
public class Role {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    public enum Values{
        ADMIN(1L),
        USER(2L);

        long roleId;
        Values(long roleId) {
            this.roleId = roleId;
        }
    }
}
