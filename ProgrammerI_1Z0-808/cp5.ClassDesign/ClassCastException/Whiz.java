package ClassCastException;

public class Whiz {
    
    public static void main(String[] args) {
    	I i = new D();
    	A a = new A();
    	
    	Object o = new String("");
    	
    	X x = new X();
    	
    	x.doIt(i);
    	x.doIt(a);
    	x.m((String) o);
    	
      	/* if (a instanceof I) {
        	I c1 = (I)a;
           	c1.meth(); // C
           	
           	A a1 = (A) c1;
           	
           	a1.meth(); // A
        }*/
    }
}

interface I {
	void meth();
}

class A implements I {
	public void meth() { System.out.println("A"); }
	void A(String s) { }
}

class C extends A implements I {
    
    @Override
	public void meth() { 
  	    //super.meth(); 
	    System.out.println("C"); 
	}
}

class D extends C {
    
    public void vai() {
        System.out.println("Vai"); 
    }
}

class X {

    public void doIt(I i) {
        
        i.meth();
        
        if (i instanceof A) {  // D, C, A
            A a = (A)i;
            a.meth();
            a.A("");
            
            if (a instanceof D) {
                D d = (D) a;
                d.meth();
                d.A("");
                d.vai();
            }
        }
        
    }
    
    public void m(String s) {}
}