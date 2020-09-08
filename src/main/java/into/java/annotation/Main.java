package into.java.annotation;

@HelloAnnotation(say = "Do it")
public class Main {

    public static void main(String[] args) {
	HelloAnnotation annotation = Main.class.getAnnotation(HelloAnnotation.class);//获取TestMain类上的注解对象
        System.out.println(annotation.say());//调用注解对象的say方法，并打印到控制台
    }
}
