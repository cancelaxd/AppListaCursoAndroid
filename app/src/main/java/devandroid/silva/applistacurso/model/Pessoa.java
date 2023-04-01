package devandroid.silva.applistacurso.model;

import androidx.annotation.NonNull;

public class Pessoa {

    //Construtor
    //Atributos - Objetos - Molde - Modelo - Template
    //Metodos de acesso - Getts and Setts

    private String primeiroNome;
    private String sobreNome; //essas 4 linhas de string sao os ATRIBUTOS
    private String cursoDesejado;
    private String telefoneContato;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {

        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Pessoa() {
    }

    // To String - Para textos - Para Strings de caracteres


    @NonNull
    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
