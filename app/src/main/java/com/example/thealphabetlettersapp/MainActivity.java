package com.example.thealphabetlettersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.thealphabetlettersapp.model.Alphabit;
import com.example.thealphabetlettersapp.model.AlphabitFcatory;
import com.example.thealphabetlettersapp.model.IAlphabitDA;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textExample;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textExample=findViewById(R.id.textExample);
    }

    public void btnAOnClick(View view) {
            AlphabitFcatory factory =new AlphabitFcatory();
            IAlphabitDA objchar =factory.getModel();

            List<Alphabit> characters=objchar.getCharachers("A");

            String str ="";
            for(Alphabit A :characters){
                str+=A.getExample()+"\n";
            }
        textExample.setText(str);

    }
    public void btnBOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("B");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnCOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("C");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnDOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("D");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnEOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("E");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnFOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("F");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnGOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("G");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnHOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("H");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnIOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("I");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnJOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("J");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnKOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("K");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnLOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("L");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnMOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("M");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnNOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("N");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnOOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("O");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnPOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("P");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnQOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("Q");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnROnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("R");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnSOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("S");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnTOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("T");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnUOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("U");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnVOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("V");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnWOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("W");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnXOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("X");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnYOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("Y");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }
    public void btnZOnClick(View view) {
        AlphabitFcatory factory =new AlphabitFcatory();
        IAlphabitDA objchar =factory.getModel();

        List<Alphabit> characters=objchar.getCharachers("Z");

        String str ="";
        for(Alphabit A :characters){
            str+=A.getExample()+"\n";
        }
        textExample.setText(str);

    }

}