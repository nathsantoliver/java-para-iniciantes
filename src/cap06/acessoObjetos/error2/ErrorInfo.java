package cap06.acessoObjetos.error2;

// Definindo objetos
public class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int howbad[] = { 3, 3, 2, 4 };

    Err getErrorInfo(int i) {   // Retorna um objeto de tipo Err.
        if(i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Invalid Error Code", 0);
        }
    }
}
