package com.bot.smartqueue.user;

import com.bot.smartqueue.offering.Offering;
import com.bot.smartqueue.user.enums.Role;
import com.bot.smartqueue.visit.Visit;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@Entity
@Table(name = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID userId;

    String fullName;

    String phone;

    String email;

    @Enumerated(EnumType.STRING)
    Role role;

    LocalDateTime createdAt;

    @OneToMany(
            cascade = {MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY
    )
    Set<Visit> visits;

    @OneToMany(
            cascade = {MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY
    )
    List<Offering> receivedOfferings;
}
