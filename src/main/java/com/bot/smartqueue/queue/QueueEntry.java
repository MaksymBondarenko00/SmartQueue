package com.bot.smartqueue.queue;

import com.bot.smartqueue.offering.Offering;
import com.bot.smartqueue.queue.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class QueueEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID queueEntryId;

    private UUID tentantId;

    private String queueNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Offering offering;

    private Status status;

    private LocalDateTime createdAt;
}
