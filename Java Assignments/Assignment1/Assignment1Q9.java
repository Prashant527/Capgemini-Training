class Student {
    private int subjectA,subjectB,subjectC;
    
    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	int student1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int student2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int student3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
		return student1+student2+student3;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	int student1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int student2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int student3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
		return (student1+student2+student3)/3;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
    	int subjectmarks[]=new int[3];
    	if(subjectName.equals("subjectA")) {
    		for(int i=0;i<3;i++) {
    			subjectmarks[i]=students[i].subjectA;
    		}
    	}
    	if(subjectName.equals("subjectB")) {
    		for(int i=0;i<3;i++) {
    			subjectmarks[i]=students[i].subjectB;
    		}	
    		}
    	else
    		for(int i=0;i<3;i++) {
    			subjectmarks[i]=students[i].subjectC;
    		}
    	return subjectmarks;
    }
    public int subjectATotalByStudents(int[] marks) {
    	int total=0;
    	for(int i=0;i<marks.length;i++) {
    		total=+marks[i];
    	}
    	return total;
    }
    public int subjectBTotalByStudents(int[] marks) {
    	int total=0;
    	for(int i=0;i<marks.length;i++) {
    		total=+marks[i];
    	}
    	return total;
    }
    public int subjectCTotalByStudents(int[] marks) {
    	int total=0;
    	for(int i=0;i<marks.length;i++) {
    		total=+marks[i];
    	}
    	return total;
    }

   public int subjectTotalByStudents(int[] marks) {
	    int total=0;
	    for(int i=0;i<marks.length;i++) {
	   		total=+marks[i];
	   	}
	   	return total;
   }

    public double subjectAAverageByStudents(int[] marks) {
	   int total=0;
   	for(int i=0;i<marks.length;i++) {
   		total=+marks[i];
   	}
   	return total/3;
   }
    public double subjectBAverageByStudents(int[] marks) {
    	int total=0;
    	for(int i=0;i<marks.length;i++) {
    		total=+marks[i];
    	}
    	return total/3;
    }
    public double subjectCAverageByStudents(int[] marks) {
    	int total=0;
    	for(int i=0;i<marks.length;i++) {
    		total=+marks[i];
    	}
    	return total/3;
    }

}
public class Assignment1Q9 {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();

	}

}
