package com.bot.smartqueue.tenant;

import com.bot.smartqueue.offering.Offering;
import com.bot.smartqueue.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@Entity
@Table(name = "tenant")
@AllArgsConstructor
@NoArgsConstructor
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tenantId;

    private String name;

    @OneToMany(
            cascade = {MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY
    )
    private List<User> employees;

    @OneToMany(
            cascade = {MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY
    )
    private List<User> clients;

    @OneToMany(
            cascade = {MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY
    )
    private List<Offering> companyOffers;
}
