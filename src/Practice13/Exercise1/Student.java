package Practice13.Exercise1;

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                '}';
    }
}
