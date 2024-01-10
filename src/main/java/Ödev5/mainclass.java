package Ödev5;

public class mainclass {
    public static void main(String[] args) {
        MuhasebeTest muhasebeTest= new MuhasebeTest(1,"salih",20000,28);
        System.out.println(calsalary(muhasebeTest).salary);
    }
    public static MuhasebeTest calsalary(MuhasebeTest muhasebeTest) {
        if (muhasebeTest.workday<25) {
            return muhasebeTest;
        }

        else {
            muhasebeTest.salary+=1000;
        }
        return muhasebeTest;


    }
}
