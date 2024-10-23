package com.example.damsem10_toastsnackbar_virtual;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnSnackBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Vinculamos el boton del formulario con mi obejeto btnToast y btnSnackBar
        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar = findViewById(R.id.buttonToast);

        //Evento Click
        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() ==R.id.buttonToast){
            Toast.makeText(this,"Todos están aprobados con TOAST", Toast.LENGTH_SHORT).show();
        }else{
            Snackbar.make(v,"Todos están desaprobados con SNACKBAR", Snackbar.LENGTH_SHORT).show();
        }

    }
}