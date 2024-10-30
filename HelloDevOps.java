public class HelloDevOps {
    public String getMessage() {
        return "Hello, DevOps!";
    }
    public String getGreetings(){
        return "Welcome DevOps";
}

    public static void main(String[] args) {
        HelloDevOps hello = new HelloDevOps();
        System.out.println(hello.getMessage());
        System.out.println(hello.getGreetings());
    }
}


