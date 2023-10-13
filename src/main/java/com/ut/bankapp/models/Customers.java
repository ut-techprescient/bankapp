package com.ut.bankapp.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Customers {
    private int id;
    private String name;
    private Accounts account;
}
