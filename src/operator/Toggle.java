package operator;

public class Toggle {
	
	public static void toggleBoolean() {
        boolean flag = true;
        System.out.println("Initial value: " + flag);
        flag = !flag;
        System.out.println("Toggled value: " + flag);
    }


	public static void main(String[] args) {
		
		toggleBoolean();
	}

}
