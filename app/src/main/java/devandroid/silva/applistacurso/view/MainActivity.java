package devandroid.silva.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
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

    SharedPreferences preferences;
    SharedPreferences.Editor listavip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    PessoaController controller;

    Pessoa pessoa;
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

        preferences = getSharedPreferences(NOME_PREFERENCES,0);
        listavip = preferences.edit();

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobrenome", ""));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));

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

        editnome = findViewById(R.id.editnome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editcurso_desejado = findViewById(R.id.editcurso_desejado);
        edittelefone_contato = findViewById(R.id.edittelefone_contato);

        editnome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editcurso_desejado.setText(pessoa.getCursoDesejado());
        edittelefone_contato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editnome.setText("");
                editSobrenome.setText("");
                editcurso_desejado.setText("");
                edittelefone_contato.setText("");

                listavip.clear();
                listavip.apply();
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

                listavip.putString("primeiroNome", pessoa.getPrimeiroNome());
                listavip.putString("sobrenome", pessoa.getSobreNome());
                listavip.putString("cursoDesejado", pessoa.getCursoDesejado());
                listavip.putString("telefoneContato", pessoa.getTelefoneContato());
                listavip.apply();

                controller.salvar(pessoa);
            }
        });

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto construcao: " + construcao.toString());

    }
 }