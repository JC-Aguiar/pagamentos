package br.com.jcaguiar.pagamentos.model.payment;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "payment_card")
public class PaymentCardModel extends PaymentModel {

    Integer installments;

}
