package test_java;
class Box3{
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	public Box3(){
		idNum = ++boxID;
	}
}
public class Box3Test1 {

	public static void main(String[] args) {
		System.out.println("1505083-Kyungmin Kim");
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();
		
		System.out.println("mybox1's id : "+mybox1.idNum);
		System.out.println("mybox2's id : "+mybox2.idNum);
		System.out.println("mybox3's id : "+mybox3.idNum);
		System.out.println("mybox4's id : "+mybox4.idNum);
		System.out.println("last box id : "+Box3.boxID + "!");

	}

}
