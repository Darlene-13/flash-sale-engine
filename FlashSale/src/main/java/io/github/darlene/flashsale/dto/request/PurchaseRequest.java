package io.github.darlene.flashsale.dto.request;


import lombok.*;
import jakarta.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PurchaseRequest{

    @NotNull(message = "Product Id is required")
    private Long productId;

    @NotBlank(message = "User identity is required")
    private String userId;
}