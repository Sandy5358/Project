package lambdaexpressiondemo;
	import java.util.*;  
	public class LambdaExpressionExample6{  
	    public static void main(String[] args) {  
	          
	        List<String> list=new ArrayList<String>();  
	        list.add("sandy");  
	        list.add("bharat");  
	        list.add("suresh");  
	        list.add("imran");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	    }  
	}  
