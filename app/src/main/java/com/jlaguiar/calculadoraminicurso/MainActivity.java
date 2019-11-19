package com.jlaguiar.calculadoraminicurso;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.jlaguiar.calculadoraminicurso.Algorithms.EvaluateString;

public class MainActivity extends AppCompatActivity {

    private Button btnNumero0;
    private Button btnNumero1;
    private Button btnNumero2;
    private Button btnNumero3;
    private Button btnNumero4;
    private Button btnNumero5;
    private Button btnNumero6;
    private Button btnNumero7;
    private Button btnNumero8;
    private Button btnNumero9;

    private Button btnAdicicao;
    private Button btnSubtracao;
    private Button btnDivisao;
    private Button btnMultiplicacao;

    private Button btnAbreParenteses;
    private Button btnFechaParenteses;
    private Button btnClear;
    private Button btnVirgula;
    private Button btnIgual;

    private Button btnApagar;

    private TextView txtPrincipal;
    private TextView txtResposta;

    public String txtAuxParaExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectando variaveis as suas "view"
        btnNumero0 = findViewById(R.id.id_btn_zero);
        btnNumero1 = findViewById(R.id.id_btn_um);
        btnNumero2 = findViewById(R.id.id_btn_dois);
        btnNumero3 = findViewById(R.id.id_btn_tres);
        btnNumero4 = findViewById(R.id.id_btn_quatro);
        btnNumero5 = findViewById(R.id.id_btn_cinco);
        btnNumero6 = findViewById(R.id.id_btn_seis);
        btnNumero7 = findViewById(R.id.id_btn_sete);
        btnNumero8 = findViewById(R.id.id_btn_oito);
        btnNumero9 = findViewById(R.id.id_btn_nove);

        btnDivisao = findViewById(R.id.id_btn_divisao);
        btnMultiplicacao = findViewById(R.id.id_btn_multiplicacao);
        btnSubtracao = findViewById(R.id.id_btn_subtracao);
        btnAdicicao = findViewById(R.id.id_btn_adicao);

        btnAbreParenteses = findViewById(R.id.id_btn_abre_parenteses);
        btnFechaParenteses = findViewById(R.id.id_btn_fecha_parenteses);
        btnClear = findViewById(R.id.id_btn_clear);
        btnVirgula = findViewById(R.id.id_btn_virgula);
        btnIgual = findViewById(R.id.id_btn_igual);

        btnApagar = findViewById(R.id.id_btn_apagar);

        txtPrincipal = findViewById(R.id.id_txt_principal);
        txtResposta = findViewById(R.id.id_txt_resposta);
        txtAuxParaExibir = "";


        //Ação do botao ao ser clicado
        btnNumero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 0;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 1;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 2;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 3;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 4;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 5;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 6;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 7;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 8;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnNumero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + 9;
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + "/";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + "*";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + "-";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnAdicicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + "+";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + ".";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Float result = EvaluateString.evaluate(txtAuxParaExibir.replace("-", " - ").replace("+", " + ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) "));
                    txtResposta.setText(String.valueOf(result));
                    if (Integer.parseInt(String.valueOf(result).replace(".", "")) / 10 == result) {
                        txtResposta.setText(String.valueOf(Integer.parseInt(String.valueOf(result).replace(".", "")) / 10));
                    }
                }catch(Exception e){
                    txtResposta.setText("Invalid syntax");
                }
            }
        });

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtAuxParaExibir.length() > 0){
                    txtAuxParaExibir = txtAuxParaExibir.substring(0,txtAuxParaExibir.length()-1);
                    txtPrincipal.setText(txtAuxParaExibir);
                }

            }
        });

        btnAbreParenteses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + "(";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnFechaParenteses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = txtAuxParaExibir + ")";
                txtPrincipal.setText(txtAuxParaExibir);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAuxParaExibir = "";
                txtPrincipal.setText("");
                txtResposta.setText("");
            }
        });

    }
}
