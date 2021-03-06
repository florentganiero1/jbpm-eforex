package com.akasi.eforex;

import org.kie.api.runtime.process.ProcessContext;
import org.json.*;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Recuperer implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public Recuperer() {
    }

    public static Object recuperation(ProcessContext kcontext, String varJson, String valJson){
        
        Object result = new Object();

        // typecasting ob to JSONObject
        try {
            String string = (String) kcontext.getVariable(varJson);
            JSONObject json = new JSONObject(string);
            result = json.get(valJson);  
            
            
            /* System.out.println(json.toString());  
            System.out.println(val); */
            
        } catch (JSONException e) {
            
             System.out.println(e.getMessage());
        }
        
        return result;
    }
    
    public static String recupString(ProcessContext kcontext, String varJson, String valJson){
        
        String result = "";

        // typecasting ob to JSONObject
        try {
            String string = (String) kcontext.getVariable(varJson);
            JSONObject json = new JSONObject(string);

            if (json.isNull(valJson)) {
                result = "null";
              } else {
                result = json.getString(valJson);
              }
            
            /* System.out.println(json.toString());  
            System.out.println(val); */
            
        } catch (JSONException e) {
            
             System.out.println(e.getMessage());
        }
        
        return result;
    }
    
   public static int recupInt(ProcessContext kcontext, String varJson, String valJson){
        
        int result = 0;

        // typecasting ob to JSONObject
        try {
            String string = (String) kcontext.getVariable(varJson);
            JSONObject json = new JSONObject(string);
             
            
            if (json.isNull(valJson)) {
                result = 0;
              } else {
                result = json.getInt(valJson);
              }
            
            
            /* System.out.println(json.toString());  
            System.out.println(val); */
            
        } catch (JSONException e) {
            
             System.out.println(e.getMessage());
        }
        
        return result;
    }

    public static Object recuperations(ProcessContext kcontext, String varJson, String valJson, String elt, int eltVal){
        
        Object result = new Object();
        int valId = 0;
        // typecasting ob to JSONObject
        try {
            String str = (String) kcontext.getVariable(varJson);
            JSONArray array = new JSONArray(str); 
            
            for(int i=0; i < array.length(); i++){  
                JSONObject object = array.getJSONObject(i);
                valId = object.getInt(elt);
                if(valId==eltVal){
                    result = object.get(valJson);
                    break;
                }
            } 
            
        } catch (JSONException e) {
            
             System.out.println(e.getMessage());
        }
        
        return result;
    }

}