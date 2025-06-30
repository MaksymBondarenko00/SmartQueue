package com.bot.smartqueue.offering;

import com.bot.smartqueue.offering.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "offering")
@AllArgsConstructor
@NoArgsConstructor
public class Offering {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID offeringId;

    UUID tentantId;

    String operationName;

    @Enumerated(EnumType.STRING)
    Type operationType;
}
