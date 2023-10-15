package Practice4.Exercise7;

class Student {
    private String имя;
    private int возраст;

    public Student(String имя, int возраст) {
        this.имя = имя;
        this.возраст = возраст;
    }

    public void учиться() {
        System.out.println(имя + " учится.");
    }

    public String получитьИмя() {
        return имя;
    }

    public int получитьВозраст() {
        return возраст;
    }
}
