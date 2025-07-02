package com.bot.smartqueue.visit;

import com.bot.smartqueue.queue.QueueEntry;
import com.bot.smartqueue.user.User;
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
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID visitId;

    @ManyToOne(fetch = FetchType.LAZY)
    QueueEntry visitData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_userId")
    User client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_userId")
    User operator;

    LocalDateTime startedAt;

    LocalDateTime finishedAt;
}
