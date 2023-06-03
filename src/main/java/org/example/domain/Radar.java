package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Radar {
    private int id;
    private String name;
    private int attack;
    private int defense;
    private int magic;
    private int difficulty;
    private int toughness;
    private int mresistance;
}
