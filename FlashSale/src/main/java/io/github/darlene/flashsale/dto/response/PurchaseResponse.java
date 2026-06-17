package io.github.darlene.flashsale.dto.response;


import lombok.*;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.darlene.flashsale.entity.OrderStatus;
import java.time.LocalDateTime;

/**
 * We do not need jpa as they do not communicate to the database
 * We do not need validators
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PurchaseResponse{
    private OrderStatus status;

    private Long productId;

    private Long orderId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fromDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime toDate;
}