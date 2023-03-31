package devandroid.silva.applistacurso.model;

import androidx.annotation.NonNull;

public class Construcao {

    private String tipoDeTrabalho;
    private String tamanhoDotrabalho;
    private String telefoneContato;


    public void setTipoDeTrabalho(String tipoDeTrabalho) {
        this.tipoDeTrabalho = tipoDeTrabalho;
    }


    public void setTamanhoDotrabalho(String tamanhoDotrabalho) {
        this.tamanhoDotrabalho = tamanhoDotrabalho;
    }


    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @NonNull
    @Override
    public String toString() {
        return "Construcao{" +
                "tipoDeTrabalho='" + tipoDeTrabalho + '\'' +
                ", tamanhoDotrabalho='" + tamanhoDotrabalho + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }

}
