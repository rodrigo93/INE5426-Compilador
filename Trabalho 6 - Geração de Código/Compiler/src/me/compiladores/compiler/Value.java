package me.compiladores.compiler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Value {
	private Object value;
	private boolean isReturnValue = false;
	private ArrayList<Value> argumentList;
	
	public Value(Object o){
		value = o;
		argumentList = new ArrayList<Value>();
		if(!(isBoolean() || isNumber() || isChar() || isString() || isIntArray())) {
            throw new RuntimeException("invalid data type: " + value + " (" + value.getClass() + ")");
        }
	}
	
	public void setValue(Value v){
		this.value = v.value;
	}
	public void addArgument(Value value){
		this.argumentList.add(value);
	}
	
	public int getNumberOfArguments(){
		return this.argumentList.size();
	}
	
    private boolean isIntArray() {
    	return value instanceof Integer[];
	}

	public boolean isBoolean() {
        return value instanceof Boolean;
    }
    
    public boolean isNumber(){
    	return value instanceof Number;
    }
    
    public boolean isChar(){
    	return value instanceof Character;
    }
    
    public boolean isString(){
    	return value instanceof String;
    }
    
    public boolean isClass(String classname){
    	return classname == value? true : false;
    }
    
    public int asNumber(){
    	return (Integer)value;
    }
    
    public char asChar(){
    	return (Character)value;
    }
    
    public boolean asBoolean(){
    	return (boolean)value;
    }
    
    public Integer[] asIntArray(){
    	return (Integer[]) value;
    }
    
    public String asString(){
    	return (String) value;
    }
    
    public boolean typeEquals(Value v){
    	if(v.isString()) 
    		return (String) value == v.asString();
    	return value.getClass().equals(v.getValue().getClass());
    }
    
    public Object getValue(){
    	return value;
    }
    
    public boolean isReturn(){
    	return isReturnValue;
    }
    
    public void setReturnValue(boolean b){
    	isReturnValue = b;
    }
    
    public String getClassType(){
    	if(isChar()) return "char";
    	if(isBoolean()) return "boolean";
    	if(isNumber()) return "int";
    	return value.toString();
    }
}
