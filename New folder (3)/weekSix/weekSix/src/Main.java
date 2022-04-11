public class Main {
    public static void main(String[] args) {

        student std, std1;
        std = new student();
        String str = "KHI";
        chnage(std, str);
        System.out.println(std.getName());
        System.out.println(str);
        std1 = new student();
        chnage(std1, str);
        System.out.println(std1.getName());
        System.out.println(std.getName());
    }
    public static void chnage(student s, String str){
        str= str + "123";
        s.setName(str);
    }

}




