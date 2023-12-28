package assissted_projects;



		public class AccessModifiersDemo {
		    private int privateVar = 10;
		    int defaultVar = 20;
		    protected int protectedVar = 30;
		    public int publicVar = 40;

		    private void displayPrivate() {
		        System.out.println("Private method invoked");
		    }

		    void displayDefault() {
		        System.out.println("Default method invoked");
		    }

		    protected void displayProtected() {
		        System.out.println("Protected method invoked");
		    }

		    public void displayPublic() {
		        System.out.println("Public method invoked");
		    }

		    public static void main(String[] args) {
		        AccessModifiersDemo obj = new AccessModifiersDemo();
		        obj.displayPrivate();
		        obj.displayDefault();
		        obj.displayProtected();
		        obj.displayPublic();
		        System.out.println("Private variable: " + obj.privateVar);
		        System.out.println("Default variable: " + obj.defaultVar);
		        System.out.println("Protected variable: " + obj.protectedVar);
		        System.out.println("Public variable: " + obj.publicVar);
		    }
		



	}

