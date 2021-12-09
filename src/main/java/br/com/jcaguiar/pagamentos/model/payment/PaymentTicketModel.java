package br.com.jcaguiar.pagamentos.model.payment;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "payment_ticket")
public class PaymentTicketModel extends PaymentModel {

    @Column(nullable = false)
    LocalDateTime expirationDate;

    @Column(nullable = false)
    LocalDateTime paymentDate;
}
