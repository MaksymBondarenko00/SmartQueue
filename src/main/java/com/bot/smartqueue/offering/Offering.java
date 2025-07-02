package com.bot.smartqueue.offering;

import com.bot.smartqueue.offering.enums.Type;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "offering")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Offering {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID offeringId;

    UUID tenantId;

    String operationName;

    @Enumerated(EnumType.STRING)
    Type operationType;
}
