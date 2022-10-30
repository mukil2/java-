import java.io.*;
import java.util.*;
class assingmentcheck
{

    String name;
    int rollno,ph,age,cgpa;
    void insert(int Roll,String Name,int phone ,int Age,int CGPA )
    {
        rollno=Roll;
        name=Name;
        ph=phone;
        age=Age;
        cgpa=CGPA;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        assingmentcheck[] a=new assingmentcheck[10];
        for(i=0;i<10;i++)
        a[i]=new assingmentcheck();
        System.out.println("Enter the details of 10 students:");
        for(i=0;i<10;i++)
        {
            System.out.println(" Enter the details of student "+(i+1));
            System.out.println("Enter the rollno:");
            int r=sc.nextInt();
            System.out.println("Enter the name:");
            String n=sc.next();
            System.out.println("Enter the phone:");
            int p=sc.nextInt();
            System.out.println("Enter the age:");
            int AGE=sc.nextInt();
            System.out.println("Enter the CGPA:");
            int c=sc.nextInt();
            a[i].insert(r,n,p,AGE,c);

        }
        int  highestcgpa=a[0].cgpa;
        String high=a[0].name;
        for(i=0;i<10;i++)
        {
            if(a[i].cgpa>highestcgpa) {
                 highestcgpa=a[i].cgpa;  
                 high=a[i].name;}
        
        System.out.println("Student with highest cgpa:"+high);

        for(i=0;i<10;i++)
        {
            String str=a[i].name;
            String str3=str.toUpperCase();
            String str2="ANU";
            if(str3.compareTo(str2)==0)
            System.out.println("Phone number of ANU:"+a[i].ph);
        }
        int small=a[0].rollno;
        int smallage=a[0].age;
        for(i=0;i<10;i++)
        {
            if(a[i].age<smallage) 
            {
                 smallage=a[i].age;
                 small=a[i].rollno;
            }

        }
        System.out.println("ROll no of  yougest student:"+small);
    }
}
}
