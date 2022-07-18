package edu.val.apiwebperros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO DEBERIAMOS CONTROLAR QUE HAY ACCESO A ITERNET
        DescargaInfoPerros descargaInfoPerros = new DescargaInfoPerros(this);
        descargaInfoPerros.execute();
    }

    public void mostrarPerroRecibido (InfoPerro infoPerro)
    {
        Log.d("ETIQUETA_LOG" ,"Perro rx = " + infoPerro.toString());
        //TODO USAR PICASO PARA LA URL DE LA IMAGEN QUE RECIBO, CARGARLA EN UN IMAGEVIEW
    }
}