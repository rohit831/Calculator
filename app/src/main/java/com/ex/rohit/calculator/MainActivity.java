package com.ex.rohit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Float mOne, mTwo;
    Boolean madd,msub,mmul,mdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button buttondot = (Button) findViewById(R.id.buttondot);
        Button button9 = (Button) findViewById(R.id.button9);
        final TextView screen= (TextView)findViewById(R.id.screen);
        final TextView output = (TextView)findViewById(R.id.output);
        Button buttonadd = (Button) findViewById(R.id.buttonadd);
        Button buttonsub = (Button) findViewById(R.id.buttonsub);
        Button buttondiv = (Button) findViewById(R.id.buttondiv);
        Button buttonmul = (Button) findViewById(R.id.buttonmul);
        Button buttonc = (Button) findViewById(R.id.buttonc);
        Button buttonac = (Button) findViewById(R.id.buttonac);
        Button buttonequal = (Button) findViewById(R.id.buttonequal);

        button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"1");
                        screen.append("1");
                    }
                }

        );
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"2");
                        screen.append("2");
                    }
                }

        );
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"3");
                        screen.append("3");
                    }
                }

        );
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"4");
                        screen.append("4");
                    }
                }

        );
        button5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"5");
                        screen.append("5");
                    }
                }

        );
        button6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"6");
                        screen.append("6");
                    }
                }

        );
        button7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"7");
                        screen.append("7");
                    }
                }

        );
        button8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"8");
                        screen.append("8");
                    }
                }

        );
        button9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"9");
                        screen.append("9");
                    }
                }

        );
        button0.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+"0");
                        screen.append("0");
                    }
                }

        );
        buttondot.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        output.setText(output.getText()+".");
                        screen.append(".");
                    }
                }
        );
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString().substring(0,output.getText().length()-1));
                screen.setText(screen.getText().toString().substring(0,screen.getText().length()-1));
            }
        });

        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                madd=false;
                msub=false;
                mmul=false;
                mdiv=false;
                screen.setText("");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mOne = Float.parseFloat(output.getText() + "");
                    madd = true;
                    output.setText(null);
                    screen.append("+");
                }

            }
        );
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOne = Float.parseFloat(output.getText() + "");
                msub = true;
                output.setText(null);
                screen.append("-");
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOne = Float.parseFloat(output.getText() + "");
                mmul = true;
                output.setText(null);
                screen.append("*");
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOne = Float.parseFloat(output.getText() + "");
                mdiv = true;
                output.setText(null);
                screen.append("/");
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTwo = Float.parseFloat(output.getText() + "");
                screen.append("=");
                if (madd== true){

                    mOne= mOne + mTwo;
                    output.setText(mOne +"");
                    madd=false;
                }


               else if (msub == true){
                    mOne= mOne - mTwo;
                    output.setText(mOne +"");
                    msub=false;
                }

                else if (mmul == true){
                    mOne=mOne * mTwo;
                    output.setText(mOne+"");
                    mmul=false;
                }

               else  if (mdiv == true){
                    mOne=mOne / mTwo;
                    output.setText(mOne +"");
                    mdiv=false;
                }
                screen.append(mOne+"");
            }
        });
    }
}
