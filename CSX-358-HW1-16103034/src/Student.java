public class Student {
	private int studentId,labPoints;
	private int assPoints[]=new int[10];
	private int midTermPoints,finalPoints,codeLabPoints;
	public static int countA=0,countB=0,countC=0,countD=0,countF=0,totalPoints=0,maxPoints=0;
	public void setStudentId(int s) {
		studentId=s;
	}
	public void setLabPoints(int l) {
		labPoints=l;
	}
	public void setAssignmentPoints(int a[]) {
		int i;
		for(i=0;i<10;i++)
			assPoints[i]=a[i];
	}
	public void setMidTermPoints(int m) {
		midTermPoints=m;
	}
	public void setFinalPoints(int f) {
		finalPoints=f;
	}
	public void setCodeLabPoints(int c) {
		codeLabPoints=c;
	}
	public int assignmentTotal() {
		int sum=0;
		for(int i=0;i<=9;i++)
			sum+=assPoints[i];
		return sum;
	}
	public int total() {
		int sum=labPoints+assignmentTotal()+midTermPoints+finalPoints+codeLabPoints;
		totalPoints+=sum;
		if(sum>maxPoints)maxPoints=sum;
		return sum;
	}
	public int percent(int total) {
		return (total*100/420);
	}
	public char grade(int p) {
		if(p>=90) {countA++;return 'A';}
		else if(p>=78&&p<=89) {countB++;return 'B';}
		else if(p>=62&&p<=77) {countC++;return 'C';}
		else if(p>=46&&p<=61) {countD++;return 'D';}
		else {countF++;return 'F';}
	}
}
