package devandroid.silva.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.silva.applistacurso.R;
import devandroid.silva.applistacurso.controller.PessoaController;
import devandroid.silva.applistacurso.model.Construcao;
import devandroid.silva.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;

    Pessoa pessoa;
    Pessoa outraPessoa;
    Construcao construcao;

    String dadosPessoa;
    String dadosOutraPessoa;

    EditText editnome;
    EditText editSobrenome;
    EditText editcurso_desejado;
    EditText edittelefone_contato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
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

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        editnome = findViewById(R.id.editnome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editcurso_desejado = findViewById(R.id.editcurso_desejado);
        edittelefone_contato = findViewById(R.id.edittelefone_contato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editnome.setText(outraPessoa.getPrimeiroNome());
        editSobrenome.setText(outraPessoa.getSobreNome());
        editcurso_desejado.setText(outraPessoa.getCursoDesejado());
        edittelefone_contato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editnome.setText("");
                editSobrenome.setText("");
                editcurso_desejado.setText("");
                edittelefone_contato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte sempre", Toast.LENGTH_LONG).show();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editnome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editcurso_desejado.getText().toString());
                pessoa.setTelefoneContato(edittelefone_contato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);
            }
        });

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
        Log.i("POOAndroid", "Objeto construcao: " + construcao.toString());

    }
}