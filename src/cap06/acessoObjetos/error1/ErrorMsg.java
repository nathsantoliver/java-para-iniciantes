package cap06.acessoObjetos.error1;

// Retorna um objeto String.
public class ErrorMsg {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Retorna a mensagem de erro.
    String getErrorMsg(int i) {   // Retorna um objeto de tipo String.
        if(i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Invalid Error Code";
        }
    }

}
