package cap06.acessoObjetos.error1;

// Rodando os parâmetros da classe ErrorMsg
public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
