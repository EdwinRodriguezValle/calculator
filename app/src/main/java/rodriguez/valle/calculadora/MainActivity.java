package rodriguez.valle.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextA;
    private EditText editTextB;
    private TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);
        textViewResultado = findViewById(R.id.resultado);

    }

    public void sumar (View view){
        double suma = Double.parseDouble(editTextA.getText().toString()) + Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(suma + " ");
    }

    public void restar (View view){
        double suma = Double.parseDouble(editTextA.getText().toString()) - Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(suma + " ");
    }

    public void multiplicar (View view){
        double suma = Double.parseDouble(editTextA.getText().toString()) * Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(suma + " ");
    }

    public void dividir (View view){
        double suma = Double.parseDouble(editTextA.getText().toString()) / Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(suma + " ");
    }


}