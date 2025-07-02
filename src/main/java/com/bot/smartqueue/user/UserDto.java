package com.bot.smartqueue.user;

import com.bot.smartqueue.offering.Offering;
import com.bot.smartqueue.visit.Visit;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record UserDto(
        UUID userId,
        String fullName,
        String phone,
        String email,
        Set<Visit> visits,
        List<Offering> receivedOfferings
) {
}
