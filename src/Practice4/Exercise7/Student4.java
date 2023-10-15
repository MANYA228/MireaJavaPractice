package Practice4.Exercise7;

class Student4 extends Student {
    private String университет;

    public Student4(String имя, int возраст, String университет) {
        super(имя, возраст);
        this.университет = университет;
    }

    public void учитьсяВУниверситете() {
        System.out.println(получитьИмя() + " учится в университете " + университет);
    }
}
