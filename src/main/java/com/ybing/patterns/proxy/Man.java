package com.ybing.patterns.proxy;


public class Man implements Person{

    private Long maney;
    private Boolean handsome;
    private Integer hight;
    private Integer weight;



    public void watch(Person person) {
        if(person instanceof FaleMan) {
            System.out.println(person);
        }
    }

    public Long getManey() {
        return maney;
    }

    public void setManey(Long maney) {
        this.maney = maney;
    }

    public Boolean getHandsome() {
        return handsome;
    }

    public void setHandsome(Boolean handsome) {
        this.handsome = handsome;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
