package Excecoes;

public class ErrorConversionYear extends RuntimeException {

   private   String menssagem;

    public ErrorConversionYear(String menssagem) {
        this.menssagem = menssagem;
    }

    @Override
    public String getMessage() {
        return this.getMessage();
    }

}

