package com.bot.smartqueue.visit;

import com.bot.smartqueue.queue.QueueEntry;
import com.bot.smartqueue.user.User;
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
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID visitId;

    @ManyToOne(fetch = FetchType.LAZY)
    private QueueEntry visitData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User operator;

    private LocalDateTime startedAt;

    private LocalDateTime finishedAt;
}
