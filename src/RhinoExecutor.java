import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class RhinoExecutor {
    public static void executeJavaScript() {
        String jsCode = "print('¡Hola, soy matias cednio y es mi programa en rhino!');";

        Context context = Context.enter();
        Scriptable scope = context.initStandardObjects();

        // Define la función 'print' en el ámbito JavaScript
        String printFunction = "function print(s) { java.lang.System.out.print(s); }";
        context.evaluateString(scope, printFunction, "definePrintFunction", 1, null);

        context.evaluateString(scope, jsCode, "JavaScript Code", 1, null);
        Context.exit();
    }
}
