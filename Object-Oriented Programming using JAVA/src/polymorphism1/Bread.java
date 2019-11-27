package polymorphism1;

public class Bread {

	
	public void calculateCalories(int b) {
		// TODO Auto-generated method stub

        int tc=b*74;
        double tc1=tc*4.1868;
        System.out.printf(tc1+"%.2f kj of energy generated from",tc+"calories");
	}

	public void calculateCalories(int b1, int j1) {
		// TODO Auto-generated method stub
		int tc=(b1*74)+(j1*26);
		double tc1=tc*4.1868;
		System.out.printf(tc1+"%.2f kj of energy generated from",tc+"calories");
	   
	}

	public void calculateCalories(int b2, int j, int bu) {
		// TODO Auto-generated method stub

	      int bun=(b2*74)+(j*26)+(bu*102);
	      double bun1=bun*4.1868;
	      System.out.printf(bun1+"%.2f kj of energy generated from",bun1+"calories");
	      
	}

}
