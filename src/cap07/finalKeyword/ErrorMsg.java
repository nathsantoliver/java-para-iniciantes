package cap07.finalKeyword;

public class ErrorMsg {
    // Código de erro.
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

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
