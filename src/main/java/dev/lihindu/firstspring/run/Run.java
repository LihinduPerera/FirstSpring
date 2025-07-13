package dev.lihindu.firstspring.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public record Run(
        @Id Integer id,
        @NotEmpty String title,
        @Column("startedon") LocalDateTime startedOn,
        @Column("completedon") LocalDateTime completedOn,
        @Positive Integer miles,
        Location location,
        @Version Integer version //We can Use this for to track, whether it is a new row or a old(existing) row
) {
    public Run {
        if(!completedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Completed On must be after Started On");
        }
    }
}
