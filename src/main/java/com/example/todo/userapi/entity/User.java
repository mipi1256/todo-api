package com.example.todo.userapi.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User {

   @Id
   @Column(name = "user_id")
   @GeneratedValue(strategy = UUID)
   private String id;

   @Column(nullable = false, unique = true)
   private String email;

   @Column(nullable = false)
   private String password;

   @Column(nullable = false)
   private String userName;

   @CreationTimestamp
   private LocalDateTime joinDate;

   @Enumerated(EnumType.STRING)
   @Builder.Default
   private Role role = Role.COMMON; // 유저 권한


}












































