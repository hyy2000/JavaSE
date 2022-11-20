public class Student {
    String name;
    int chinese ;
    int math;
    int eng;
    int score;

    public Student(String name, int chinese, int math, int eng) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.eng = eng;
        this.score = chinese+math+eng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", eng=" + eng +
                ", score=" + score +
                '}';
    }
}
