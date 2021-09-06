
import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;


class demoFile {
  public static void main(String args[]) {
    System.out.println("Hello!!");

    System.out.println(PyLib.isPythonRunning());
    PyLib.startPython();

    PyModule math = PyModule.importModule("math");
    double pi = math.getAttribute("pi").getDoubleValue();

    PyObject sin = math.getAttribute("sin");
    System.out.println(math.call("sin",pi/2));

    PyModule myT = PyModule.importModule("myT");
    double myPI = myT.getAttribute("myPI").getDoubleValue();
    System.out.println("--> " + myPI);
 
    PyObject myPIlong = myT.getAttribute("myMATH");
    double myPIlongValue = myPIlong.getAttribute("myPIc").getDoubleValue();
    System.out.println(myPIlongValue);

    
  }
}

