import java.io.*;
public class CSX_358_HW1_16103034 {

	public static void main(String[] args)throws IOException {
		String outputFirstLine="Stdnt Id  Ex  -------- Assignments --------  Tot  Mi  Fin  CL  Pts  Pct  Gr";
		FileReader fr=new FileReader("E:\\SEM 4\\Programs\\Java Programs\\java assignment\\Assignment-1\\HW1-data.txt");
		FileWriter fw=new FileWriter("E:\\SEM 4\\Programs\\Java Programs\\java assignment\\Assignment-1\\HW1-output-16103034.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		BufferedReader br=new BufferedReader(fr);
		bw.write(outputFirstLine);
		bw.newLine();
		String line;
		int i,total,percent;
		int a[]=new int[10];
		Student s=new Student();
		while((line=br.readLine())!=null) {
			String[] arr=line.split(" ");
			s.setStudentId(Integer.parseInt(arr[0]));
			s.setLabPoints(Integer.parseInt(arr[1]));
			for(i=2;i<=11;i++)
				a[i-2]=Integer.parseInt(arr[i]);
			s.setAssignmentPoints(a);
			s.setMidTermPoints(Integer.parseInt(arr[12]));
			s.setFinalPoints(Integer.parseInt(arr[13]));
			s.setCodeLabPoints(Integer.parseInt(arr[14]));
			bw.write(arr[0]);
			bw.write("  "+arr[1]+" ");
			for(i=2;i<=11;i++) {
				bw.write(String.format("%3s",arr[i]));
			}
			bw.write("  ");
			bw.write(String.valueOf(s.assignmentTotal()));
			bw.write("  "+arr[12]);
			bw.write("  "+arr[13]);
			bw.write("  "+String.format("%3s",arr[14])+"  ");
			total=s.total();
			bw.write(String.valueOf(total));
			bw.write("  ");
			percent=s.percent(total);
			bw.write(String.valueOf(percent));
			bw.write("   ");
			bw.write(s.grade(percent));
			bw.newLine();
		}
		bw.newLine();
		bw.newLine();
		bw.write("Average total point percent of all students: ");
		bw.write(String.valueOf(Student.totalPoints*100/((Student.countA+Student.countB+Student.countC+Student.countD+Student.countF)*420)));
	    bw.newLine();
	    bw.newLine();
		bw.write("Number of A's = "+String.valueOf(Student.countA));
		bw.newLine();
		bw.write("Number of B's = "+String.valueOf(Student.countB));
		bw.newLine();
		bw.write("Number of C's = "+String.valueOf(Student.countC));
		bw.newLine();
		bw.write("Number of D's = "+String.valueOf(Student.countD));
		bw.newLine();
		bw.write("Number of F's = "+String.valueOf(Student.countF));
		bw.newLine();
		bw.newLine();
		bw.write("Maximum points = "+String.valueOf(Student.maxPoints));
		br.close();
	    bw.close();
	}
}

