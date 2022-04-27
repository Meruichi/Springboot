package test;

public class Calc {
private String a;
public Calc(String a) {
	super();
	this.a = a;
}

public String getA() {
	return a;
}
public void setA(String a) {
	this.a = a;
}

public int plus( int x, int y) {int z = x + y;
return z;}
public int minus( int x, int y) {int z = x - y;
return z;}
public int multiple( int x, int y) {int z = x * y;
return z;}
public int division( int x, int y) { int z = 0;
if(y != 0) { z = x / y;} return z; } 	

}
