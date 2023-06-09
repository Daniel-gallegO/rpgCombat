package com.accentur.rpgCombat;

public class Character {

    private String name;
    private Long health;
    private Integer level;
    private Boolean isAlive;

    public Character(String name) {
        this.name = name;
        this.health = 1000L;
        this.level = 1;
        this.isAlive = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHealth() {
        return this.health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}
