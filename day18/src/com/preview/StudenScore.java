package com.preview;
/*需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。*/
public class StudenScore {
    private String name;
    private int chines;
    private int math;
    private int eng;
    private int score;

    public StudenScore() {

    }

    public StudenScore(String name, int chines, int math, int eng) {
        this.name = name;
        this.chines = chines;
        this.math = math;
        this.eng = eng;
       // this.score = sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChines() {
        return chines;
    }

    public void setChines(int chines) {
        this.chines = chines;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int sum(){
        return this.chines+this.eng+this.math;
    }

    @Override
    public String toString() {
        return "StudenScore{" +
                "name='" + name + '\'' +
                ", chines=" + chines +
                ", math=" + math +
                ", eng=" + eng +
                ", score=" + sum() +
                '}';
    }
}
