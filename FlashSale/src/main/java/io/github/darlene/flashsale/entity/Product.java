package io.github.darlene.flashsale.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "products")
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany(mappedBy ="product", cascade = CascadeType.ALL, orphanRemoval= true)
    private List<Order>  order = new ArrayList<>();

    @Column(name= "stock", nullable = false)
    @PositiveOrZero
    private Integer stock;

    @Column(name = "product_name",unique = true, nullable = false) //DB Validation
    @NotBlank // Application validation
    private String productName;

    @Column(name= "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
}