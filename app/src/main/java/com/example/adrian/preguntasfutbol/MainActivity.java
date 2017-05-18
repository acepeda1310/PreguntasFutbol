package com.example.adrian.preguntasfutbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnCheckedChangeListener{
    TextView pregunta;
    TextView respuesta;
    RadioButton rbMadrid;
    RadioButton rbBarcelona;
    RadioButton rbAtleti;
    RadioGroup equipos;
    CheckBox gusta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        pregunta=(TextView)findViewById(R.id.pregunta);
        respuesta=(TextView)findViewById(R.id.respuesta);
        rbMadrid=(RadioButton)findViewById(R.id.madrid);
        rbBarcelona=(RadioButton)findViewById(R.id.barcelona);
        rbAtleti=(RadioButton)findViewById(R.id.atleti);
        gusta=(CheckBox)findViewById(R.id.gusta);
        equipos=(RadioGroup)findViewById(R.id.grupo);

        gusta.setOnCheckedChangeListener(this);
        equipos.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        try{
            if(gusta.isChecked())
                respuesta.setText(R.string.sigusta);
            else
                respuesta.setText(R.string.nogusta);
        } catch(Exception e){

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(rbMadrid.isChecked())
            respuesta.setText(R.string.madrid);
        else if(rbBarcelona.isChecked())
            respuesta.setText(R.string.barcelona);
        else
            respuesta.setText(R.string.atleti);
    }
}
