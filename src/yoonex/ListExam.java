package yoonex;

import java.util.ArrayList;
import java.util.List;

public class ListExam{
    public List<String> addArray(String[]arr1, String[]arr2){
        List<String> list = new ArrayList<String>();
        
        for(String str : arr1){
            System.out.println(str); 
            list.add(str);
        }
        
        for(String str : arr2){
            System.out.println(str);
            list.add(str);
        }
        
        return list;
    }
    
    public static void main(String[] args){
    	ListExam le = new ListExam();
        
        String[] arr1 = {"rk","sk","ek"};
        String[] arr2 = {"dh","fps","wl"};
        
        List fhf = le.addArray(arr1, arr2);
        
        System.out.println(fhf);
        
    }
}