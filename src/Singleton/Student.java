package Singleton;

public class Student {

	   private static Student instance = null;
	   private Student() {
	      // Exists only to defeat instantiation.
	   }

	   public static Student getInstance() {
	      if(instance == null) {
	         instance = new Student();
	      }
	      return instance;
	   }
	}