package devandroid.silva.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.silva.applistacurso.R;
import devandroid.silva.applistacurso.model.Construcao;
import devandroid.silva.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    Construcao construcao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteudo, dados, valores para o Objeto
        //Conforme o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Douglas");
        pessoa.setSobreNome("Silva Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-979565411");

         outraPessoa = new Pessoa();
         outraPessoa.setPrimeiroNome("Nadabe");
         outraPessoa.setSobreNome("Maximo da Silva");
         outraPessoa.setCursoDesejado("Java");
         outraPessoa.setTelefoneContato("11-15615615.");

         construcao = new Construcao();
         construcao.setTipoDeTrabalho("Drywall");
         construcao.setTamanhoDotrabalho("Grande");
         construcao.setTelefoneContato("8628462889");


        int parada = 0;

    }
}