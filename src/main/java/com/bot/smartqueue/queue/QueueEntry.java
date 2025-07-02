package com.bot.smartqueue.queue;

import com.bot.smartqueue.offering.Offering;
import com.bot.smartqueue.queue.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class QueueEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID queueEntryId;

    UUID tenantId;

    String queueNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    Offering offering;

    Status status;

    LocalDateTime createdAt;
}
