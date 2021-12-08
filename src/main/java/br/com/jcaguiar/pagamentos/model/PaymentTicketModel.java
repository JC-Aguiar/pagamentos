package br.com.jcaguiar.pagamentos.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "payment_ticket")
public class PaymentTicketModel extends PaymentModel {

    @Column(nullable = false)
    LocalDateTime expirationDate;

    @Column(nullable = false)
    LocalDateTime paymentDate;
}
