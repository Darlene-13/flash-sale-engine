package io.github.darlene.flashsale.entity;




import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name ="orders")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY) // relationship with the booked product, don't pull full product anytime you load an order
    @JoinColumn(name = "product", nullable =false)
    private Product product;

    @Column(unique = true, nullable = false)
    private String userId;

    @Column(name = "status")
    private OrderStatus status;

    @Column()
    @CreationTimestamp
    private LocalDateTime createdAt;

}