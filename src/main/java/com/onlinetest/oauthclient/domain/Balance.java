package com.onlinetest.oauthclient.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@SuperBuilder
public class Balance {

    private long accountNumber;

    private long customerNumber;

    private BigDecimal balance;

}
