package com.ut.bankapp.models;


import com.ut.bankapp.enums.AccountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Accounts {
    private int accountId;
    private AccountType accountType;
    private float amount;
}
