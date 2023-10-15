package Practice4.Exercise7;

class Schoolboy extends Student{
    private int класс;

    public Schoolboy(String имя, int возраст, int класс) {
        super(имя, возраст);
        this.класс = класс;
    }

    public void ходитьВШколу() {
        System.out.println(получитьИмя() + " ходит в " + класс + " класс.");
    }
}
