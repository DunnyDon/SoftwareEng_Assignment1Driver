package Running;

import org.joda.time.DateTime;

import Project_Package.CourseProgramming;
import Project_Package.Modules;
import Project_Package.Student;

public class Driver_To_Run_Project {
	public static void main(String[] args) {
		Student Conor = new Student("Conor", "13/10/1995",123456);
		Student Frank = new Student("Frank","14/08/1990",234567);
		Student Barbara = new Student("Barbara","26/03/1993",345678);
		DateTime start = new DateTime("2015-09-04");
		DateTime end = new DateTime("2016-05-15");
		Student students[] = {Conor,Frank};
		Student studen[]={Barbara,Conor};
		Modules SoftwareEng = new Modules("Software Engineering",432,students);
		Modules OOP = new Modules("Object Orientated Programming",000,studen);
		Modules mods[] = {SoftwareEng,OOP};
		CourseProgramming CTCourse = new CourseProgramming("Computer Science",mods,start,end);
		System.out.println(CTCourse.getName()+"\nStarting "+CTCourse.getStartDate().toDate()+"\nEnding "+CTCourse.getEndDate().toDate());
		Modules mod[]=CTCourse.getModules();
		System.out.print("Modules offered by "+CTCourse.getName()+" are ");
		for(int i=0;i<mod.length;i++){
			System.out.println("\n"+mod[i].getMod_Name());
			Student s[] = mod[i].getStudents();
			System.out.println("Students enrolled for this module are:");
			for(int j=0;j<s.length;j++){
				System.out.println(s[j].getName());
			}
		}

	}

}
