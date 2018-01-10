import java.util.Scanner;
public class ReadandSplit {
	Scanner input = new Scanner(System.in);
	String s;
	System.out.printf("%s\n","enter your txt");
	s = input.nextLine();
	String[] arr = s.split("\\s");
	int i=0;
	for ( String ss : arr) {
		 i=i+1;
	}
	System.out.printf("%d\n",i);
	String pin[] = new String[i];
	int j=0;
	for (j=0;j<i;j++) {
	    pin[j]=arr[j];
	}
	for (j=0; j<i; j++) {
		System.out.printf("%s\n",pin[j]);
	}
}